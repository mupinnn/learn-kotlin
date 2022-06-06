package com.mupin.kotlin.oop

//  Overloading merupakan fitur pada fungsi yang sangat powerful.
//  Overloading adalah istilah untuk menggunakan dua atau lebih fungsi dengan nama yang sama
//  dan hanya dapat dilakukan selama parameter pada fungsi tersebut berbeda.
class Calculator {
    fun add(a: Int, b: Int) = a + b
    fun add(a: Int, b: Int, c: Int) = a + b + c
    fun add(a: Double, b: Double) = a + b
    fun add(a: Float, b: Float) = a + b

    fun min(a: Int, b: Int) = if (a < b) a else b
    fun min(a: Double, b: Double) = if (a < b) a else b
}

fun main() {
    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(1, 2, 3))
    println(calc.add(2.5, 5.7))
    println(calc.add(2.35f, 4.65f))

    println(calc.min(2, 4))
    println(calc.min(2.5, 2.45))
}