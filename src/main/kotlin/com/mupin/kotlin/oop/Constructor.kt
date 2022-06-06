package com.mupin.kotlin.oop

//  Parameter ini merupakan primary constructor
class PrimaryConstructor(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    //    Init block
    //    Memungkinkan untuk menuliskan properti di body class ketika menggunakan primary constructor
    //    Init block juga bisa membantu dalam memvalidasi properti yang dikirim sebelum dibuat
    init {
        //    Gunakan `this` jika nama properti di paramter head class sama dengan yang ada pada body class
        this.weight = if (weight < 0) 1.0 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}

//  Secondary constructor digunakan ketika ingin menginisialisasi kelas dengan cara
//  yang lain. Secondary constructor bisa dibuat lebih dari 1 dalam sebuah kelas.
class SecondaryConstructor(name: String, weight: Double, age: Int) {
    var name: String
    var weight: Double
    var age: Int
    var isMammal: Boolean = false

    init {
        this.name = name
        this.age = age
        this.weight = weight
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(
        name,
        weight,
        age
    ) {
        this.isMammal = isMammal
    }
}

//  Kotlin secara otomatis membuat sebuah default constructor pada kelas jika tidak
//  ada constructor yang dibuat secara manual di dalamnya.
class DefaultConstructor {
    val name: String = "Uhuy"
    val age: Int = 20
}

fun main() {
    val p = PrimaryConstructor("Cat", 1.5, 1, false)
    println(
        """
            Nama: ${p.name}
            Berat: ${p.weight}
            Umur: ${p.age}
            Mamalia: ${if (p.isMammal) "Ya" else "Bukan"}
        """.trimIndent()
    )

    val s = SecondaryConstructor("Cow", 2.5, 1)
    val s1 = SecondaryConstructor("Dog", 3.0, 2, true)

    val d = DefaultConstructor()
    println(d.name)
}