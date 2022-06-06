package com.mupin.kotlin

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Direction(val printableName: String) {
    NORTH("North") {
        override fun printValue() {
            println("Value of NORTH is $printableName")
        }
    },
    EAST("East") {
        override fun printValue() {
            println("Value of EAST is $printableName")
        }
    },
    SOUTH("South") {
        override fun printValue() {
            println("Value of SOUTH is $printableName")
        }
    },
    WEST("West") {
        override fun printValue() {
            println("Value of WEST is $printableName")
        }
    };

    abstract fun printValue()
}

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println("colorRed value: ${colorRed.value.toString(16)}")

    println("Red: $colorRed")
    println("Green: $colorGreen")
    println("Blue: $colorBlue")

    val colors: Array<Color> = Color.values()
    println("Colors: ${colors.contentToString()}")

    println("Position of `RED` on `Color` enum is ${Color.RED.ordinal}")

    println("Values of `Direction` enum is ${Direction.values().contentToString()}")

    // Anonymous class to create specific method inside enum
    Direction.SOUTH.printValue()

    println(Direction.SOUTH.printableName)
    println(enumValueOf<Direction>("SOUTH"))
    println(Direction.valueOf("SOUTH"))

    val directions: Array<Direction> = Direction.values()
    directions.forEach { dir -> println("$dir ") }
}