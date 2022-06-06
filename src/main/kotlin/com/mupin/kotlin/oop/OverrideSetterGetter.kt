package com.mupin.kotlin.oop

class OverrideSetterGetter {
    //    Write the setter and getter directly after the property
//    declaration if want to override the setter and getter of the property
    var name = "Default name"
        set(value) {
            field = "${this.name} $value"
        }
    var age = 17
        get() = field + 10

    fun eat() {
        println("Eating")
    }
}

fun main() {
    val myClass = OverrideSetterGetter()
    println(myClass.name)
    myClass.name = "New name"
    println(myClass.name)
    println(myClass.age)
}