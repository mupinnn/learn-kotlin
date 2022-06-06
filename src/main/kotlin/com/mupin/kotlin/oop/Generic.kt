package com.mupin.kotlin.oop

interface List<T> {
    operator fun get(index: Int): T
}

//  Class generic
class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

//  Generic function
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    return this
}

fun main() {
    val longArrayList = ArrayList<Long>()
    val longList = LongList()

    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))
}