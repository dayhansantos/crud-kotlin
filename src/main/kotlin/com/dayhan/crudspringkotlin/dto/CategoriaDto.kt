package com.dayhan.crudspringkotlin.dto

data class CategoriaDto(
    val id: Int?,
    val nome: String = "",
    val produtos: List<ProdutoDto>? = emptyList())
