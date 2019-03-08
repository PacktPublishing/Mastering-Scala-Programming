// =================================================================
// Mastering Scala Programming
// Chapter 01
// Subject: Flow Control in Scala
// =================================================================

// Welcome
val helloWorld = "Welcome aboard, to Mastering Scala Programming !"
println(helloWorld)

// Tuples (We are use a lot with Spark).
// They are immutable lists.
// Often thought of as database fields, or columns.
// Useful for passing around entire rows of data.
val myFirstTuple = ("Pitagoras", "Fibonacci", "Euclides",
  "Descartes", "Einstein")
println(myFirstTuple)

// How to extract values out of the tuple.
println(myFirstTuple._1)
println(myFirstTuple._2)
println(myFirstTuple._3)

// How to create a key/value pair.
val mathTheorem = "Pitagoras" -> "Hypotenuse Theorem"
println(mathTheorem._2)
println(mathTheorem._1)

// You can mix different types in a tuple
val aBunchOfStuff = ("Pitagoras", 3.14, true)

// Lists - they are like a tuple.
// They are Collection object that has more functionality.
val greatMinds = List("Pitagoras", "Fibonacci", "Euclides",
  "Descartes", "Einstein")

// To extract values from the list.
println(greatMinds(0))
println(greatMinds(1))
println(greatMinds(2))

// head and tail function.
// head function list all the first values
// tail function list all the last values
println(greatMinds.head)
println(greatMinds.tail)

// Iterating through the list
for (minds <- greatMinds) {println(minds)}

// map() function.
// Can be used to apply any function to every item in a collection.
val backwardMinds = greatMinds.map((minds: String) => {minds.reverse})
for (minds <- backwardMinds) {println(minds)}

// reduce() function
// Can be used to combine together all the items.
// In a collection using some function.
val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce((x: Int, y: Int) => x + y)
println(sum)

// filter() function.
// Can remove stuff you don't want.
// Here we'll introduce wildcard syntax while we're at it.
val iDontLikeNumberFive = numberList.filter((x: Int) => x != 5)
println(iDontLikeNumberFive)

val iDontLikeNumberThree = numberList.filter(_ != 3)
println(iDontLikeNumberThree)

// Concatenating lists
val moreNumbers = List(6, 7, 8)
val lotsOfNumbers = numberList ++ moreNumbers
println(moreNumbers)
println(lotsOfNumbers)

// More stuff fun with list
val reversed = numberList.reverse
println(reversed)

val sorted = reversed.sorted
println(sorted)

val lotsOfDuplicates = numberList ++ numberList
val distinctValues = lotsOfDuplicates.distinct
println(lotsOfDuplicates)
println(distinctValues)

val maxValue = numberList.max
println(maxValue)

val total = numberList.sum
println(total)

val hasThree = iDontLikeNumberThree.contains(3)
println(hasThree)

// Maps
// Useful for key/value lookups on distinct keys.
// Like dictionaries in other languages.
val greatMinds = Map("Pitagoras" -> "Hypotenuse Theorem", "Fibonacci" -> "Golden Ratio")
println(greatMinds("Fibonacci"))

// Dealing with missing keys/values
println(greatMinds.contains("Euclides"))

val mapMissingValues = util.Try(greatMinds("Euclides")) getOrElse "Unknown"
println(mapMissingValues)

