package com.mupin.kotlin

fun buildText(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("basic builder")
    return stringBuilder.toString()
}

fun lambdaBuildText(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val msg = buildText()
    println(msg)

    val msgLambda = lambdaBuildText {
        append("Hello ")
        append("from ")
        append("lambda with receiver")
    }
    println(msgLambda)
}