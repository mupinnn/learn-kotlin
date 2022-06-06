package com.mupin.kotlin

fun main() {
    var name: String? = null
    // name = "Ahmad"

    if (name != null) {
        println("My name is $name with length ${name.length}")
    } else {
        println("\$name is still null")
    }

    // Safe calls
    println("\$name length: ${name?.length}")

    // Elvis Operator
    // Jika objek bernilai null, tetapkan default value
    println("If \$name is null, set default value with \"Faqih\" = ${name?.length ?: "Faqih"}")

    // Non-null assertion
    // Akan menghasilkan error `NullPointerException` karena memaksa mengakses properti
    // pada objek yang null
    println("\$name length with non-null: ${name!!.length}")
}