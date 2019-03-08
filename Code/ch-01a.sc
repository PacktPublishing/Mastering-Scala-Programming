// =================================================================
// Mastering Scala Programming
// Chapter 01
// Subject: Scala Basics
// =================================================================

// Welcome
val helloWorld = "Welcome aboard, to Mastering Scala Programming !"
println(helloWorld)

// val - are immutable like constants.
// You can't change them once defined.
val myFirstVal: String = "Hello"
println(myFirstVal)

// var - are mutable like variables.
// You can change them once defined.
var myFirstVar: String = myFirstVal
myFirstVar = myFirstVar + ", World!"
println(myFirstVar)


// One key objective of functional programming
// is to use immutable objects as often as possible.
// Try to use operations that transform immutable
// objects into a new immutable object.
// For example, we could have done the same thing like this:
val immutableHelloWorld = myFirstVal + ", World!"
println(immutableHelloWorld)

// Some other types
val number: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSinglePrecision: Float = 3.14159265f
val bigNumber: Long = 1234567890l
val smallNumber: Byte = 127

// String printing tricks
// Concatenating stuff with +:
println("You type the number: " + number)
println("and the letter: " + letterA)

// Print formatted style:
println(f"Pi is equal $piSinglePrecision%.3f")
println(f"Zero padding on the left: $number%05d")

// Substituting in variables:
println(s"I can use the dollar prefix to use variables like $number $truth $letterA")

// Substituting expressions (with curly brackets):
println(s"The dollar prefix isn't limited to variables;\nI can include any expression. Like ${1+2}")

// Using regular expressions:
val lastAnswer: String = "To life, the universe, and everything this " +
  "is the best number: 1.618 (Fibonacci Golden Ratio)"
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = lastAnswer
val answer = answerString.toInt
println(answer)

// Dealing with booleans
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater && isLesser
val fibonacci: String = "Fibonacci"
val bestNumber: String = "Golden Ratio"
val isBest: Boolean = fibonacci == bestNumber
