object Variables extends App {
  println(" Scala has two kind of variables, val and var")
  val a =5 // stay constants
  val b=6
  var c = a + b // can change
  println(a,b,c)
  c=55
  println(a,b,c)
}
