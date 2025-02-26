class Dog (val name: String, var weight: Int, breed_param: String) {
  var activities = arrayOf("Walks")
  val breed = breed_param.toUpperCase()
  val weightInKgs: Double
    get() = weight / 2.2

  init {
    println("Dog $name has been created with $breed")
  }
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

//class Dog(name_param: String, weight_param: Int, breed_param: String) {
//  val name = name_param
//  var weight = weight_param
//  val breed = breed_param
//
//  fun bark() {
//    println(if (weight < 20) "Yip!" else "Woof!")
//  }
//}

fun main(args: Array<String>) {
  var myDog = Dog("Fido", 70, "Mixed")
  println(myDog.name)
  myDog.weight = 75

  val dogs = arrayOf(
    Dog("Fido", 70, "Mixed"),
    Dog("Ripper", 10, "Poodle")
  )
  for (dog in dogs)
    dog.bark()
}