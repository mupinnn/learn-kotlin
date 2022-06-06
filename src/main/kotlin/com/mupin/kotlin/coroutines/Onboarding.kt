package com.mupin.kotlin.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Coroutines!!")
    }

    println("Hello,")
    delay(200L)
}