package com.dayhan.crudspringkotlin.service

import com.dayhan.crudspringkotlin.domain.Categoria
import com.dayhan.crudspringkotlin.repository.CategoriaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoriaService(val categoriaRepository: CategoriaRepository) {

    fun find(id: Int): Optional<Categoria> = categoriaRepository.findById(id)
}