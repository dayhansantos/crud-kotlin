package com.dayhan.crudspringkotlin.repository

import com.dayhan.crudspringkotlin.domain.Produto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository : JpaRepository<Produto, Int>