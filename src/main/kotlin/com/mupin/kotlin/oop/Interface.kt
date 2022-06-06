interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        println("I believe, I can fly with $numberOfWings wings!")
    }
}

fun main() {
    val bird = Bird(4)
    bird.fly()
}