package com.mupin.kotlin

fun main() {
    val array = arrayOf(1, 3, 5, 7)
    val mixedArray = arrayOf(1, 3, 5, true, "Hai")
    val intArray = intArrayOf(1, 3, 5, 6)

    // Error, karena `intArrayOf` hanya menerima tipe data `Int`
    // intArray[3] = "Hai"

    // Constructor `Array()` menerima argumen `size` dan fungsi lambda
    // untuk men-generate elemen dari array yang ingin dibuat
    val withConstructor = Array(4) { i -> i + 1 } // [1, 2, 3, 4]

    println("Basic array: ${array.contentToString()}")
    println("Mixed array: ${mixedArray.contentToString()}")
    println("Integer array: ${intArray.contentToString()}")
    println("Constructor array: ${withConstructor.contentToString()}")
}