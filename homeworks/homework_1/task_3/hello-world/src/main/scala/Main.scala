object Main extends App {
  def welcome(my_name: String, hello: String) = {
    println(hello + " Scala! This is " + my_name)
  }

  var my_name = "Alexander Klabukov"

  welcome(my_name, "Hello")
  welcome(my_name, "Hola")
  welcome(my_name, "Guten tag")

  my_name = my_name.reverse

  welcome(my_name, "Hello")
  welcome(my_name, "Hola")
  welcome(my_name, "Guten tag")
}