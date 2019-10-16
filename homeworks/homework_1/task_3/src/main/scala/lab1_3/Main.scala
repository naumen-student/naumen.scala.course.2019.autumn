package lab1_3

object Main extends App {
  val myName = "George Guba"
  val myNameReverse = myName.reverse

  val greetingsArr = Array("Hello Scala! This is ", "Hola! este es ", "Guten tag, das ist ")

  def printGreetings(username:String):Unit = {
    greetingsArr.foreach(value => println(value + username))
  }

  printGreetings(myName)
  printGreetings(myNameReverse)
}