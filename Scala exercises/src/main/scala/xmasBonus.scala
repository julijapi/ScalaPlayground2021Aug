object xmasBonus extends App {
  import scala.io.StdIn.readLine

  val name = readLine("Enter your name: ")
  val years = readLine("How long are you working at the firm?").toDouble
  val wage = readLine("What is your monthly wage?").toDouble
  if (years >= 2) {
    val bonus = ((years-2) * (wage*0.15)).round
    println(s"Congratulations your bonus is $bonus")
  }
  else {
    println("You are not eligible for the bonus.")
  }

}
