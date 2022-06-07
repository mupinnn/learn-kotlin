package com.mupin.kotlin.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

//  Sequential approach
//  Kode pada coroutine tetap dijalankan secara berurutan seperti kode pada umumnya
//fun main() = runBlocking {
//    var capital = getCapital() // Menunggu 1 detik
//    var income = getIncome() // Menunggu 1 detik
//
//    //  2 detik kemudian
//    println("Your profit is ${income - capital}")
//}

//  Async approach
//  Jika fungsi tidak ada ketergantungan satu sama lain dan ingin menjalankannya
//  secara bersamaan, di sinilah `async` dibutuhkan.
//fun main() = runBlocking {
//    //  Kedua fungsi di bawah ini seolah-olah dijalankans secara bersamaan
//    //  dan membutuhkan waktu yang lebih singkat
//    var capital = async { getCapital() }
//    var income = async { getIncome() }
//
//    println("Your profit is ${income.await() - capital.await()}")
//}

//  Benchmark perbandingan waktu eksekusi non-async dengan async
fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println(
        """
            -- Completed --
            Non-async = $timeOne ms
            Async = $timeTwo ms
        """.trimIndent()
    )
}