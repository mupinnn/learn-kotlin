package com.mupin.kotlin.oop

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default Name"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class GenericDelegation {
    private var value: Any = "Default value"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Hero {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Utensil {
    var name: Any by GenericDelegation()
    var weight: Any by GenericDelegation()
    var price: Any by GenericDelegation()
}

fun main() {
    val hero = Hero()
    hero.name = "Herooooooooo!"
    println("Hero name: ${hero.name}")

    val person = Person()
    person.name = "Faqih"
    println("Person name: ${person.name}")

//    Generic property delegation
    val utensil = Utensil()
    utensil.name = "My Name"
    utensil.price = 1000
    utensil.weight = 1.5
}