// =================================================================
// Mastering Scala Programming
// Chapter 01
// Subject: Flow Control in Scala
// =================================================================

// Welcome
val helloWorld = "Welcome aboard, to Mastering Scala Programming !"
println(helloWorld)

// If..else syntax
// You can use this way
val fibonacci = 1.68
val pi = 3.14

if (fibonacci < pi) println("Impossible!") else println("The Fibonacci number is perfect!")

// If..else syntax
// Or You can use this way
if (fibonacci == pi) {
  println("Impossible!")
} else {
  println("But, the Fibonacci number is perfect!")
}

// Like switch in other languages:
val number = 3
number match {
  case 1 => println("Option One")
  case 2 => println("Option Two")
  case 3 => println("Option Three")
  case _ => println("Something else")
}

// Loops - FOR
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

// Loops - WHILE
var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

// Loops - DO..WHILE
x = 0
do { println(x); x+=1 } while (x <= 10)

// Expressions
// "Returns" the final value in a block automatically
{val x = 10; x + 20}
println({val x = 10; x + 20})
