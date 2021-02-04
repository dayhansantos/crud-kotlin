package com.dayhan.crudspringkotlin

import com.dayhan.crudspringkotlin.domain.Categoria
import com.dayhan.crudspringkotlin.domain.Produto
import com.dayhan.crudspringkotlin.repository.CategoriaRepository
import com.dayhan.crudspringkotlin.repository.ProdutoRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudSpringKotlinApplication(
	val categoriaRepository: CategoriaRepository,
	val produtoRepository: ProdutoRepository) : CommandLineRunner {

	override fun run(vararg args: String?) {
		val cat1 = Categoria(nome = "Informática")
		val cat2 = Categoria(nome = "Escritório")

		val p1 = Produto(nome = "Computador", preco = 2000.0)
		val p2 = Produto(nome = "Impressora", preco = 800.0)
		val p3 = Produto(nome = "Mouse", preco = 80.0)

		cat1.produtos.addAll(listOf(p1, p2, p3))
		cat2.produtos.add(p3)

		p1.categorias.addAll(listOf(cat1))
		p2.categorias.addAll(listOf(cat1, cat2))
		p3.categorias.addAll(listOf(cat1))

		categoriaRepository.saveAll(listOf(cat1, cat2))
		produtoRepository.saveAll(listOf(p1, p2, p3))
	}
}

fun main(args: Array<String>) {
	runApplication<CrudSpringKotlinApplication>(*args)
}
