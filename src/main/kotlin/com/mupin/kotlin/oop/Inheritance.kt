package com.mupin.kotlin.oop

import com.sun.org.apache.xpath.internal.operations.Bool

open class Hewan(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur zzzzzzz...")
    }
}

class Kucing(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : Hewan(name, weight, age, isCarnivore) {
    fun info() {
        println(
            """
                -- Kucing --
                Nama: $name
                Berat: $weight
                Age: $age
                Warna Bulu: $furColor
            """.trimIndent()
        )
    }

    fun playWithHuman() {
        println("Kucing $name sedang bermain!")
    }

    override fun eat() {
        println("Kucing $name sedang makan")
    }

    override fun sleep() {
        println("Kucing $name sedang tidur")
    }
}

class Ular(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val skinColor: String,
    val isToxic: Boolean
) : Hewan(name, weight, age, isCarnivore) {
    fun bite() {
        println("Ular $name menggigit dan ${if (isToxic) "beracun" else "tidak beracun"}")
    }
}

fun main() {
    val kucingGendut = Kucing("Item", 3.0, 1, true, "black", 4)
    kucingGendut.info()
    kucingGendut.playWithHuman()
    kucingGendut.sleep()
    kucingGendut.eat()

    val ularSerem = Ular("Viper", 4.0, 1, true, "green", true)
    ularSerem.bite()
}