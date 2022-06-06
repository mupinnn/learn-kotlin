package com.mupin.kotlin

import kotlin.random.Random

fun main() {
//    `when` sebagai statement
//    val value = 7
//    when (value) {
//        6 -> println("Value is 6")
//        7 -> println("Value is 7")
//        8 -> println("Value is 8")
//    }

//    `when` sebagai expression
//    blok `else` wajib ditambahkan ketika menggunakan `when` sebagai expression
//    val value = 8
//    val resultValue = when (value) {
//        6 -> "Value is 6"
//        7 -> "Value is 7"
//        // mendukung blok kode dengan kurung kurawal
//        8 -> {
//            print("Value is ")
//            "8 (Eight)"
//        }
//        // bisa menambahkan `else` jika tidak ada kondisi yang terpenuhi
//        else -> "Value cannot be reached"
//    }
//
//    println(resultValue)

//    Mengecek suatu instance dengan `is`
//    val value: Any = 100
//    when (value) {
//        is Long -> println("the value has a Long type")
//        !is Long -> println("the value is not a Long type")
//        else -> println("undefined type")
//    }

//    Memeriksa apakah suatu nilai masih termasuk ke dalam suatu `range`
//    val target = 27
//    val ranges = 10..50
//    when (target) {
//        in ranges -> println("Value is in the range")
//        !in ranges -> println("Value is outside the range")
//        else -> println("Value undefined")
//    }

//    Lokal variabel sebagai subjek pada `when` untuk diakses dan terbatas di dalam body `when` itu sendiri
//    fun getRegisterNumber() = Random.nextInt(100)
//    val registerNumber = when (val regis = getRegisterNumber()) {
//        in 1..50 -> 50 * regis
//        in 51..100 -> 100 * regis
//        else -> regis
//    }
//    println("Your register number is $registerNumber")
}