package Example

object Main extends App {
  val name = "Petr"
  val greeting = List("Hello","Hi","Hola")
  val str = " scala! This is "
  def greet(s1: String, s2: String, s3: String) = {
    println(s1 + s2 + s3)
  }
  for(i <- 0 to 2){
    greet(greeting(i),str,name)
    greet(greeting(i),str,name.reverse)
  }
}
