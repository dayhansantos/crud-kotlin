package com.dayhan.crudspringkotlin.resources

import com.dayhan.crudspringkotlin.domain.Categoria
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/categorias"])
class CategoriaResource {

    @RequestMapping(method = [RequestMethod.GET])
    fun listar(): List<Categoria> {
        val cat1 = Categoria(1, "Informática")
        val cat2 = Categoria(2, "Escritório")
        return listOf(cat1, cat2)
    }
}