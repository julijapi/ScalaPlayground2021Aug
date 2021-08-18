import scala.io.StdIn.readLine

object Factorial extends App {
  val number = readLine("Please enter a whole number for which  you want factorial").trim.toInt
  println(s"Will calculate factorial of number $number")
  var result = 1
  for (n <- 2 to number) result *= n
  println(s"Factorial of $number is $result")

  var resultToo = number //resultToo not the best name :0
  for (n <- number-1 to 2 by -1) resultToo *= n
  println(s"Fact $number is $resultToo")

  var resultAgain = 1
  var n = 2
  while (n <= number) {
    resultAgain *= n
    n += 1
  }
  println(s"Fact again of $number is $resultAgain")

  result = 1 //reset result
  for (n <- 2 to number) {
    result *= n
    println(s"n is $n, result so far is $result")
  } // same as result = result * n
  println(s"Factorial of $number is $result")

  var addResult = 0 //for addition we would do zero
  for (n <- 1 to number) addResult += n
  println(s"sum of numbers from 1 to $number is $addResult")
  //there is the Gauss formula for this
  //and also a shorter way of doing it for simple summation
  println((1 to number).sum)
}