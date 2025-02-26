open class Animal {
  open val image = ""
  open val food = ""
  open val habitat = ""
  var hunger= 10

  open fun makeNoise() {
    println("The Animal is making a noise")
  }

  open fun eat() {
    println("The Animal is eating")
  }

  open fun roam() {
    println("The Animal is roaming")
  }

  fun sleep() {
    println("The Animal is sleeping")
  }
}

class Hippo : Animal() {
  override val image = "hippo.jpg"
  override val food = "grass"
  override val habitat = "water"

  override fun makeNoise() {
    println("Grunt! Grunt!")
  }

  override fun eat() {
    println("The Hippo is eating $food")
  }
}
fun main(args: Array<String>) {

}