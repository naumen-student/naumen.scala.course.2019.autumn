package example

  object Main extends App {
    val name = "Alexandr Gurin"
    val greeting = List("Hello","Hola","Gutten tag")
    val str = " scala! This is "

    println("Block one: ")
    def hello(s1: String, s2: String, s3: String): Unit = {
      println(s1 + s2 + s3)
    }

    for(i <- 0 to 2){
      hello(greeting(i),str,name)
    }

    println("Block two:")

    for(i <- 0 to 2){
      hello(greeting(i),str,name.reverse)
    }
  }