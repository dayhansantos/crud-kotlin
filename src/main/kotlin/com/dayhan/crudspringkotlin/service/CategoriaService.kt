package com.dayhan.crudspringkotlin.service

import com.dayhan.crudspringkotlin.domain.Categoria
import com.dayhan.crudspringkotlin.domain.toDto
import com.dayhan.crudspringkotlin.dto.CategoriaDto
import com.dayhan.crudspringkotlin.exception.NotFoundException
import com.dayhan.crudspringkotlin.repository.CategoriaRepository
import org.springframework.stereotype.Service

@Service
class CategoriaService(val categoriaRepository: CategoriaRepository) {

    fun find(id: Int): CategoriaDto = categoriaRepository.findById(id)
        .map { it.toDto() }
        .orElseThrow { NotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: "+ Categoria::class.java.name) }
}