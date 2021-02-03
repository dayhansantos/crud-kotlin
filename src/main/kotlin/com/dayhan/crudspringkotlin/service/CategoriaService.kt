package com.dayhan.crudspringkotlin.service

import com.dayhan.crudspringkotlin.domain.Categoria
import com.dayhan.crudspringkotlin.repository.CategoriaRepository
import org.springframework.stereotype.Service

@Service
class CategoriaService(val categoriaRepository: CategoriaRepository) {

    fun find(id: Int): Categoria? = categoriaRepository.findById(id).orElse(null)
}