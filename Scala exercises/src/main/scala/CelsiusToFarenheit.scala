import java.lang.Math.round
import scala.io.StdIn.readLine

object CelsiusToFarenheit extends App{

    //write a function (name it yourself) to calculate Farenheit from Celsius
    //f = 32 + c*9/5
    def CelToFahr(c: Double)  = round(32+ c * 9 / 5)

    val cel = readLine("Enter Temperature in Celsius: ").toDouble
    var far =CelToFahr(cel)
    println(s" Temperature in Farenheit is $far")
    //test it with 36.6
    //test it with 37
    //test it with 48.5
  }

