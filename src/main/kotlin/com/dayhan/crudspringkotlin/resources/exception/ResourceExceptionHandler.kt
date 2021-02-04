package com.dayhan.crudspringkotlin.resources.exception

import com.dayhan.crudspringkotlin.exception.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ResourceExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(NotFoundException::class)])
    fun objectNotFound(e: NotFoundException, request: WebRequest) : ResponseEntity<StandardError> {
        val error = StandardError(HttpStatus.NOT_FOUND.value(), e.message!!, System.currentTimeMillis())
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error)
    }
}