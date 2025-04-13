package uz.nodir.kotlin_reactive.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.switchIfEmpty
import uz.nodir.kotlin_reactive.entity.Customer
import uz.nodir.kotlin_reactive.exception.EntityNotFound
import uz.nodir.kotlin_reactive.model.CustomerDTO
import uz.nodir.kotlin_reactive.repository.CustomerRepository
import java.time.LocalDateTime
import java.util.*


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/
@Service
class CustomerService(val repository: CustomerRepository) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun getAll(): Flux<Customer> {
        return repository.findAll()
    }

    fun create(customerDTO: CustomerDTO): Mono<Customer> {
        val customer = Customer(null, customerDTO.username, LocalDateTime.now())
        log.info("Creating new customer: {}", customer)
        return repository.save(customer);
    }

    fun getById(id: Long): Mono<Customer> {
        return repository.findById(id)
                .map {
                    log.info("entity : {}", it)
                    Optional.of(it)
                }
                .switchIfEmpty {
                    Mono.just(Optional.empty())
                }
                .handle { t, sink ->
                    if (t.isEmpty) {
                        sink.error(EntityNotFound("Customer with id: %d not found".format(id)))
                    } else {
                        log.info("Customer found: {}", t.get())
                        sink.next(t.get())
                    }
                }
    }
}