package uz.nodir.kotlin_reactive.repository


import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import uz.nodir.kotlin_reactive.entity.Customer


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/

@Repository
interface CustomerRepository : ReactiveCrudRepository<Customer, Long> {
}