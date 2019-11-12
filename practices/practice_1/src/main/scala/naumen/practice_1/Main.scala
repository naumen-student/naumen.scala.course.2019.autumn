package naumen.practice_1

object Main extends App {

  println("Hello world")

}

case class Person(name: String, age: Int)

object MyAwesomeModule{
  def run(): Unit={
    val list: Seq[(Int, String)]=Seq((1,""), (2, "Hello"))

    def foo(x: Any, y: Any):Nothing = ???

    val bar: PartialFunction[(Int, String), Int]={case (x,y) if x>1 => 1}
    //val bar2: PartialFunction[Seq[(Int, String)], Int]={case x => x(0)}

    val person=Person("Tanya", 21)
    val person2=person.copy(age=person.age+1)

    val bar3: PartialFunction[Person,Int]={case Person(name123,ageSomething)=>name123.length+ageSomething}

    list(1)

    bar.apply(1, "")
  }
}