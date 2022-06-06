package com.mupin.kotlin

fun sumNumbers(vararg number: Int): Int {
    var result: Int = 0
    for (num in number) result += num
    return result
}

//  Extension Functions
fun Int.print() {
    println("the value of this integer is $this")
}

fun Int.multiplyByThree(): Int {
    return this * 3
}

//  Extension Properties
val Int.half: Int
    get() = this / 2

typealias Arithmetic = (Int, Int) -> Int
typealias NullableArithmetic = ((Int, Int) -> Int)?

val sum: Arithmetic = { a, b -> a + b }
val multiply: Arithmetic = { a, b -> a * b }
val nullableSum: NullableArithmetic = { a, b -> a + b }

//  Referencing `count` here using `::` operator
fun count(a: Int, b: Int): Int {
    return a + b
}

fun isEvenNumber(number: Int) = number % 2 == 0

val sumReflection: Arithmetic = ::count

fun main() {
//    vararg
    val spreadedArr = intArrayOf(6, 7, 8, 9, 10)
    val sums = sumNumbers(1, 2, 3, 4, 5, *spreadedArr)
    println("Sums is $sums")

//    Function Extensions
    10.print()
    println(10.multiplyByThree())
    println(10.half)

//    Function type
    println("Sum of 10+10 = ${sum(10, 10)}")
    println("Multiply of 10x10 = ${multiply(10, 10)}")
    println("Nullable sum of 10 + 10 = ${nullableSum?.invoke(10, 10)}")

//    Reflection/Reference
    println(sumReflection(20, 10))
    val numbers = 1..10
    val evenNumbers = numbers.filter(::isEvenNumber)
    println("Even numbers ref 1-10 = $evenNumbers")
}