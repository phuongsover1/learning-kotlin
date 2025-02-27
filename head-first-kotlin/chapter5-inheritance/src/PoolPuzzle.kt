abstract class Appliance {
  var pluggedIn = true
  abstract val color: String
  abstract fun consumePjower()
}

class CoffeeMaker : Appliance() {
  override val color = ""
  override fun consumePjower() {
    println("Consuming power")
  }

  fun fillWithWater() {
    println("Fill with water")
  }

  fun makeCoffee() {
    println("Make the coffee")
  }
}
