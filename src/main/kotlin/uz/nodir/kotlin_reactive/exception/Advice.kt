package uz.nodir.kotlin_reactive.exception

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/
@RestControllerAdvice
class Advice {
    private val log = LoggerFactory.getLogger(javaClass)

    @ExceptionHandler(EntityNotFound::class)
    fun entityNotFound(e: EntityNotFound): ResponseEntity<Any> {
        log.error("Exc: {}", e.message)
        return ResponseEntity.ok(
                e.message
        )
    }

}