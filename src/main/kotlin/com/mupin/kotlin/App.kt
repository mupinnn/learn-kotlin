package com.mupin.kotlin

// Fungsi yang wajib didefinisikan karena merupakan sebuah entry point
// yang otomatis akan dipanggil ketika program dijalankan.
fun main() {
    val name = "Faqih"

    print("Hello, my name is ")
    println(name) // create new line after the output

    print(if (true) "Always true" else "Always false") // doesn't create new line
    print("I'm here!")
}