package com.dayhan.crudspringkotlin.repository

import com.dayhan.crudspringkotlin.domain.Categoria
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CategoriaRepository : CrudRepository<Categoria, Int> {
    override fun findById(id: Int): Optional<Categoria>
}