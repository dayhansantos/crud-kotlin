package com.dayhan.crudspringkotlin.resources

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/categorias"])
class CategoriaResource {

    @RequestMapping(method = [RequestMethod.GET])
    fun listar(): String {
        return "REST está funcionando"
    }
}