package com.mupin.kotlin.oop

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val myCat = Animal("Mpus", 4.2, 1, true)
    println(
        """
           Nama: ${myCat.name}
           Berat: ${myCat.weight}
           Umur: ${myCat.age}
           Mamalia: ${if (myCat.isMammal) "Ya" else "Bukan"}
        """.trimIndent()
    )
    myCat.eat()
    myCat.sleep()
}