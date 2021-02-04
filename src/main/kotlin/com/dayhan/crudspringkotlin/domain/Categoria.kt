package com.dayhan.crudspringkotlin.domain

import javax.persistence.*

@Entity
data class Categoria(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val nome: String = "")
{
    @ManyToMany(mappedBy = "categorias")
    val produtos: MutableList<Produto> = mutableListOf()
}
