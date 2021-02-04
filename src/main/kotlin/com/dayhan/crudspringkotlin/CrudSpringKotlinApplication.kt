package com.dayhan.crudspringkotlin

import com.dayhan.crudspringkotlin.domain.Categoria
import com.dayhan.crudspringkotlin.repository.CategoriaRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudSpringKotlinApplication(val categoriaRepository: CategoriaRepository) : CommandLineRunner {
	override fun run(vararg args: String?) {
		val cat1 = Categoria(null, "Informática")
		val cat2 = Categoria(null, "Escritório")

		categoriaRepository.saveAll(listOf(cat1, cat2))
	}
}

fun main(args: Array<String>) {
	runApplication<CrudSpringKotlinApplication>(*args)
}
