package uz.nodir.kotlin_reactive.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import uz.nodir.kotlin_reactive.model.CustomerDTO
import uz.nodir.kotlin_reactive.service.CustomerService


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/
@RestController
@RequestMapping("/customer")
class CustomerController(val customerService: CustomerService) {

    @GetMapping
    fun getAll(): ResponseEntity<Any> =
            ResponseEntity.ok(customerService.getAll())

    @PostMapping
    fun create(@RequestBody customerDTO: CustomerDTO): ResponseEntity<Any> =
            ResponseEntity.ok(customerService.create(customerDTO))

    @GetMapping("{id}")
    fun getById(@PathVariable("id") id: Long): ResponseEntity<Any> =
            ResponseEntity.ok(customerService.getById(id))


}