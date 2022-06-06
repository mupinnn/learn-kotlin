package com.mupin.kotlin.oop

class ExtensionProperties(var name: String, var age: Int)

//  Properti baru ini tidak akan benar-benar berada di dalam kelas yang di-extend.
//  Karena itu, extension ini harus dilakukan di luar kelas dengan mendefinisikan
//  setter dan getter secara eksplisit.
val ExtensionProperties.getInfo: String
    get() = "Name: ${this.name}, Age: ${this.age}"

fun main() {
    val ext = ExtensionProperties("Exteend", 20)
    println(ext.getInfo)
}