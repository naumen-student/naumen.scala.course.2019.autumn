object Exercises {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[U >: T <: Animal](animal: U): Shelter[U] = {
      val list: List[U] = animals :+ animal
      Shelter(list)
    }

    def ++[U >: T <: Animal](shelter: Shelter[U]): Shelter[U] = {
      val list: List[U] = animals ++ shelter.animals
      Shelter(list)
    }

    def getNames: List[String] = {
      animals.map(_.name)
    }

    def feed[U >: T <: Animal](food: Food[U]): List[String] = {
      animals.map(x => food.feed(x))
    }
  }


  trait Food[T <: Animal] {
    def name: String

    def feed(animal: T): String = s"${animal.name} eats ${name.toLowerCase}"
  }

  case object Meat extends Food[Animal] {
    override def name: String = "Meat"
  }

  case object Milk extends Food[Cat] {
    override def name: String = "Milk"
  }

  case object Bread extends Food[Dog] {
    override def name: String = "Bread"
  }

}
