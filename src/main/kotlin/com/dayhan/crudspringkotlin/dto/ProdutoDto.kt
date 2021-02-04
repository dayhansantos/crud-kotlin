package com.dayhan.crudspringkotlin.dto

data class ProdutoDto(
    val id: Int?,
    val nome: String = "",
    val preco: Double = 0.0)
