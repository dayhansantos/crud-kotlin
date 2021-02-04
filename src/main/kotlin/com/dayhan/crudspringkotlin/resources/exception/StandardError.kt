package com.dayhan.crudspringkotlin.resources.exception

data class StandardError(val status: Int, val msg: String, val timeStamp: Long)
