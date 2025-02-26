open class Animal {
  var image = ""
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
  init {
    image = "hippo.jpg"
  }
  override val food = "grass"
  override val habitat = "water"
}
fun main(args: Array<String>) {

}