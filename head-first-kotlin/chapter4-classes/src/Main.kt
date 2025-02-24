class Dog (val name: String, var weight: Int, val breed: String) {
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog.name)
    myDog.weight = 75

    val dogs = arrayOf(Dog("Fido", 70, "Mixed"), Dog("Ripper", 10, "Poodle"))
    for (dog in dogs)
        dog.bark()
}