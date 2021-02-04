package com.dayhan.crudspringkotlin.resources

import com.dayhan.crudspringkotlin.dto.CategoriaDto
import com.dayhan.crudspringkotlin.service.CategoriaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/categorias"])
class CategoriaResource(
    private val categoriaService: CategoriaService
) {

    @GetMapping(value = ["/{id}"])
    fun find(@PathVariable id: Int): ResponseEntity<CategoriaDto> {
        val categoria = categoriaService.find(id)
        return ResponseEntity.ok(categoria)
    }
}