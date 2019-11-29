package naumen.practice_2
import java.sql.Timestamp

object GenealogicalTree1  {
  type GenealogicalTree = List[List[String]]

  case class Person(name: String, birthDate: Timestamp)

  val a = Person("Михаил Федоровоич", new Timestamp(1))
  val b = Person("Евдокия Стрешнева", new Timestamp(1))
  val c = Person("Алексей Михайлович", new Timestamp(1))

}

