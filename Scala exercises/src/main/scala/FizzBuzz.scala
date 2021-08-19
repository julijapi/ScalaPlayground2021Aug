object FizzBuzz extends App{

    for (number <- 1 to 100) {
      if ((number % 5 == 0) && (number % 7 == 0)) println("FizzBuzz")
      if (number % 7 == 0 && number % 5 != 0) println("Buzz")
      if (number % 5 == 0 && number % 7 !=0 )  println("Fizz")
      if ((number % 5 != 0) && (number % 7 != 0)) println (s"$number")
    }


  }

