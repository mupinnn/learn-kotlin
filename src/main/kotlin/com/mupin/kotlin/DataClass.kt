package com.mupin.kotlin

import javax.xml.crypto.Data

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Ahmad", 21)
    val user1 = User("Ahmad", 21)
    val dataUser = DataUser("Ahmad", 21)
    val dataUser1 = DataUser("Ahmad", 21)

    println(user)
    println(dataUser)

    println(user.equals(user1))
    println(dataUser.equals(dataUser1))

    println(dataUser.copy(age = 18))

//    Destructuring
//    Manually:
    println(dataUser.component1())
    println(dataUser.component2())
//    Automatically:
    val (name, age) = dataUser
    println(name)
    println(age)
}