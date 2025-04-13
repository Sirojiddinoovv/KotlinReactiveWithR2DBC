package uz.nodir.kotlin_reactive.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/
@Table
data class Customer(
        @Id
        val id: Long?,
        val username: String,
        val createdAt: LocalDateTime
        ) {


}

