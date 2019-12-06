object Main extends App {
  val a=" Scala! This is "
  val name="Tanya"
  val greetings=List("Hello", "Hola", "Guten tag")

  printGreeting(name)
  printGreeting(name.reverse)

  def printGreeting(name: String): Unit = {
    for(greeting <-greetings){
      println(greeting+a+name)
    }
  }
}
