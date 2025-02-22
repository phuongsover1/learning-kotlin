fun main(args: Array<String>) {
  val options = arrayOf("Rock", "Paper", "Scissors")

}


//fun max(a: Int, b: Int): Int = if (a > b ) a else b
// More Shorten Version
//fun max(a: Int, b: Int) = if (a > b) a else b

// Code Magnets
fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]