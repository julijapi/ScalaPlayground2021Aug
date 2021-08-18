import scala.io.StdIn.readLine

val name = readLine("Enter your name: ")

//Ask for how long they have worked at the firm
val years = readLine("How long are you working at the firm?").toDouble

//Ask for monthly wage
val wage = readLine("What is your monthly wage?").toDouble

//Calculate Xmas bonus if they have worked at least 2  years
//Bonus is years worked over 2 years * 15% of monthly wage
//so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)

//if they are not eligible for bonus you should say so
if (years >= 2) {
  val bonus = (years-2) * (wage*0.15)
  //    val bonus = ((years-2) * (wage*0.15)*100).round /100 //remember to round at the last possible moment you do not want to round too many times
  //above example is how we round to 2 digits after zero
  println(s"Congratulations your bonus is $bonus")
}
else {
  println("You are not eligible for the bonus.")
}

}