fun main(args: Array<String>) {
  val options = arrayOf("Rock", "Paper", "Scissors")
  val gameChoice = getGameChoice(options)
  val userChoice = getUserChoice(options)
  printResult(userChoice, gameChoice)
}


//fun max(a: Int, b: Int): Int = if (a > b ) a else b
// More Shorten Version
//fun max(a: Int, b: Int) = if (a > b) a else b

// Code Magnets
fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
  // Read the user input
  var userChoice = ""
  var isValidChoice = false
  while (!isValidChoice) {
    // Ask the user for their choice
    print("Please enter one of the following options:")
    for (item in optionsParam)
      print(" $item")
    println(".")
    val userInput = readLine()
    // Validate user input
    if (userInput != null && userInput in optionsParam) {
      isValidChoice = true
      userChoice = userInput
    }
    if (!isValidChoice) println("You must enter a valid option.")
  }
  return userChoice
}

// print result
fun printResult(userChoice: String, gameChoice: String): Unit {
  val result: String
  if (userChoice == gameChoice) result = "Tie"
  else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
    (userChoice == "Scissors" && gameChoice == "Paper") ||
    (userChoice == "Paper" && gameChoice == "Rock")
  )
    result = "You Win!"
  else result = "You Lose!"
  println("You chose $userChoice, I chose $gameChoice. $result")
}