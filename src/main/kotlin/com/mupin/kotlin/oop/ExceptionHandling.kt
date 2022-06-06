package com.mupin.kotlin.oop

fun main() {
    val someNulLValue: String? = null
    lateinit var someMustNotNullValue: String

//    try {
//        someMustNotNullValue = someNulLValue!!
//        println(someMustNotNullValue)
//    } catch (e: Exception) {
//        someMustNotNullValue = "Try Catch: Nilai string null"
//        println(someMustNotNullValue)
//    }

//    Blok `finally` akan dipanggil setelah blok try dan catch selesai.
//    `finally` juga akan dieksekusi ketika exception yang ditangkap oleh catch
//    tidak sesuai, misal catch berharap `NullPointerException` namun yang terjadi adalah
//    `NumberFormatException`
//    try {
//        someMustNotNullValue = someNulLValue!!
//    } catch (e: Exception) {
//        someMustNotNullValue = "Try Catch Finally: Nilai string null"
//    } finally {
//        println(someMustNotNullValue)
//    }

//    Multiple catch
//    Berguna untuk menangani tiap excaption secara khusus seperti pesan error yang berbeda
//    untuk tiap exception
    val someStringValue: String? = "12.0"
    var someIntValue = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
//        Akan terpanggil ketika terjadi `NullPointerException`
        someIntValue = 0
    } catch (e: NumberFormatException) {
//        Akan terpanggil ketika terjadi `NumberFormatException`
        someIntValue = -1
    } finally {
//        Akan terpanggil setelah blok try/catch selesai
        when (someIntValue) {
            0 -> println("Blok catch `NullPointerException` dieksekusi!")
            -1 -> println("Blok catch `NumberFormatException` dieksekusi!")
            else -> println(someIntValue)
        }
    }
}