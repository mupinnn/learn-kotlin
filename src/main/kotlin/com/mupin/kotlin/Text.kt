package com.mupin.kotlin

fun main() {
    // Char
    var firstAlpha: Char = 'A'
    // Error Char
    // var firstThreeAlpha: Char = 'ABC'
    println("Vocal " + firstAlpha++)
    println("Vocal " + firstAlpha++)
    println("Vocal " + firstAlpha++)

    val raw = """
        Line 1
        Line 2
        Line 3
        Line 4
    """
    println(raw)

    val num = 26
    val template = "My lucky number is = $num"
    println(template)

    println(printUser("Ahmad"))

    voidPrintUser("Ahmad Void")
}

fun printUser(name: String): String {
    return "My name is $name"
}

fun voidPrintUser(name: String) {
    val lastName = "Hey"
    println("Your name is $name $lastName")
}