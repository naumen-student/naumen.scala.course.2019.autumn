package homework_3

import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_prettyBooleanFormatter - {
      assert(Exercises.prettyBooleanFormatter1(true) == "правда")
      assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter1(123) == "123")
      assert(Exercises.prettyBooleanFormatter1("Scala4LIFE") == "Scala4LIFE")

      assert(Exercises.prettyBooleanFormatter2(true) == "правда")
      assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter2(11) == "11")
      assert(Exercises.prettyBooleanFormatter2("Scala4LIFE") == "Scala4LIFE")

      assert(Exercises.prettyBooleanFormatter3(true) == "правда")
      assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter3(156) == "156")
      assert(Exercises.prettyBooleanFormatter3("Scala4LIFE") == "Scala4LIFE")
    }
    'test_max - {
      assert(Exercises.max1(Seq[Int](-50, 0, 33)) == 33)
      assert(Exercises.max1(Seq[Int]()) == 0)

      assert(Exercises.max2(Seq[Int](-99, 0, 150)) == Seq[Int](150))
      assert(Exercises.max2(Seq[Int]()) == Nil)

      assert(Exercises.max3(Seq[Int](-1, 0,999)) == Option[Int](999))
      assert(Exercises.max3(Seq[Int]()).isEmpty)
    }
    'test_sum - {
      assert(Exercises.sum1(-1, 5) == 4)
      assert(Exercises.sum2(-1, 9) == 8)
      assert(Exercises.sum3(-1, 10) == 9)
    }
  }
}
