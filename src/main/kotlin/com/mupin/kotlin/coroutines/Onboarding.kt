package com.mupin.kotlin.coroutines

import kotlinx.coroutines.*

//  `runBlocking` merupakan coroutine utama
fun main() = runBlocking {
    //  `launch` untuk menjalankan coroutine baru
    launch {
        //  Menunda kode berikutnya selama 1 detik tanpa memblokir sebuah thread.
        //  `delay` merupakan suspending function
        delay(1000L)
        println("Coroutines!!")
    }

    // Main thread akan terus berjalan sehingga fungsi ini langsung dijalankan
    println("Hello,")

    // `delay` di sini berfungsi untuk menunda selama 2 detik sebelum JVM berakhir
    delay(2000L)

    /*
        Program ini akan menghasilkan output:
        Hello,
        *menunggu 1 detik*
        Coroutines!!
        *menunggu 2 detik*
        *selesai, program exit*
     */
}