package uz.nodir.kotlin_reactive.exception

import lombok.experimental.StandardException


/**
@author: PC
@date: 18.02.2024
@group: DavrCoders

 **/
@StandardException
class EntityNotFound : RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable) : super(cause)
}