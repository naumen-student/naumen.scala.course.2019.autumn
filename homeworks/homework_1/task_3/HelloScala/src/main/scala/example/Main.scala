package example

object Main extends App {
  var str = " Scala! This is "
  var strHello = "Hello"
  var strHola = "Hola"
  var strGutenTag = "Guten tag"
  var name = "Apalikov Andrey"
  println(strHello + str + name)
  println(strHola + str + name)
  println(strGutenTag + str + name)
  println(strHola + str + name.reverse)
  println(strGutenTag + str + name.reverse)
}
