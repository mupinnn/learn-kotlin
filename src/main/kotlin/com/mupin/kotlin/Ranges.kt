package com.mupin.kotlin

fun main() {
    val rangeInt = 1..10 // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//    rangeInt.forEach { i -> print(i) }

//    Mengubah `step` atau jarak antar nilai. Nilai default dari `step` adalah 1
    val rangeCustomStep = 1..10 step 2 // 1, 3, 5, 7, 9
//    rangeCustomStep.forEach { i -> print(i) }

//    Nilai `step` bisa diakses melalu properti `step`
    println("Step for `rangeCustomStep` is ${rangeCustomStep.step}")

//    Selain dengan operator `..`, range juga bisa didefinisikan menggunakan
//    `rangeTo()` dan `downTo()`
    val intRangeTo = 1.rangeTo(10)
    val intRangeDown = 10.downTo(1)

//    Mengecek nilai apakah termasuk dalam cakupan tertentu
    if (7 in intRangeDown) {
        println("Value 7 is available")
    }

    val charRange = 'A'.rangeTo('F')
    for ((idx, value) in charRange.withIndex()) {
        println("Character: $value in index $idx")
    }
}