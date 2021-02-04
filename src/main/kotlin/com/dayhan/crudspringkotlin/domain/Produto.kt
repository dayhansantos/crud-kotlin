package com.dayhan.crudspringkotlin.domain

import com.dayhan.crudspringkotlin.dto.ProdutoDto
import javax.persistence.*

@Entity
data class Produto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val nome: String = "",
    val preco: Double = 0.0
) {
    @ManyToMany
    @JoinTable(
        name = "PRODUTO_CATEGORIA",
        joinColumns = [JoinColumn(name = "produto_id")],
        inverseJoinColumns = [JoinColumn(name = "categoria_id")]
    )
    val categorias: MutableList<Categoria> = mutableListOf()
}

fun Produto.toDto() = ProdutoDto(id, nome, preco)