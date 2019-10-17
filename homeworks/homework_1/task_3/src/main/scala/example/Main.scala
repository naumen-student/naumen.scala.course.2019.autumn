package example

object Main extends App {
  val hello = "Hello"
  val main_part = " Scala! This is "
  val name = "Ilya Zakharchenko"
  println(hello+main_part+name)
  val hello_germ = "Gutten Tag"
  val hello_rus = "Privet"
  val hello_esp = "Hola"
  println(hello_rus+main_part+name)
  println(hello_germ+main_part+name)
  println(hello_esp+main_part+name)
  println(hello_rus+main_part+name.reverse)
  println(hello_germ+main_part+name.reverse)
  println(hello_esp+main_part+name.reverse)
}
