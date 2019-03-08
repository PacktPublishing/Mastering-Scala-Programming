// =================================================================
// Mastering Scala Programming
// Chapter 01
// Subject: Flow Control in Scala
// =================================================================

// Welcome
val helloWorld = "Welcome aboard, to Mastering Scala Programming !"
println(helloWorld)

// Function syntax:
// def <function_name>(parameter_name: type): return_type = { expression }
// Very important: DON’T forget the equal signal,
// before the expression.
def squareNumber(x: Int): Int = {
  x * x
}
println(squareNumber(2))

def cubeNumber(x: Int): Int = {x * x * x}
println(cubeNumber(2))

// Creating a function that calls another function as parameter
def transformNumber(x: Int, f: Int => Int): Int = {
  f(x)
}
val result = transformNumber(2, cubeNumber)
println(result)

val result = transformNumber(2, squareNumber)
println(result)

// "Lambda functions" or "anonymous functions" or
// "function literals".
// You can declare functions inline without even
// giving them a name.
// This is very common in Spark for example.
transformNumber(3, x => x * x * x)
transformNumber(10, x => x / 2)
transformNumber(2, x => {val y = x * 2; y * y})
