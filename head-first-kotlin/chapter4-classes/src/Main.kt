class Dog(val name: String, weight_param: Int, breed_param: String) {
  var activities = arrayOf("Walks")
  val breed = breed_param.toUpperCase()
  var weight = weight_param
    set(value) {
      if (value > 0) field = value
    }
  val weightInKgs: Double
    get() = weight / 2.2

  init {
    println("Dog $name has been created with $breed")
  }

  init {
    println("The breed is $breed")
  }

  fun bark() {
    println(if (weight < 20) "Yip!" else "Woof!")
  }

  fun printInfo() = println("Dog $name has been create with $weight")
}

fun main(args: Array<String>) {
  val myDog = Dog("Fido", 70, "Mixed")
  myDog.bark()
  myDog.weight = 75
  println("Weight in Kgs is ${myDog.weightInKgs}")
  myDog.weight = -2
  println("Weight is ${myDog.weight}")
  myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
  for (item in myDog.activities)
    println("My Dog enjoys $item")

  val dogs = arrayOf(Dog("Kelpie", 20,"Westie"),
    Dog("Ripper", 10, "Poddle"))
 dogs[1].bark()
 dogs[1].weight = 15
  println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
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
