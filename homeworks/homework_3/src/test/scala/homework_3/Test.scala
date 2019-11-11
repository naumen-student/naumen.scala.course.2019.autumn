package homework_3

import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_example - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
    }

    'prettyBooleanFormatter1 - {
      assert(Exercises.prettyBooleanFormatter1(true) == "правда")
      assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter1(10) == "10")
    }
    'prettyBooleanFormatter2 - {
      assert(Exercises.prettyBooleanFormatter2(true) == "правда")
      assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter2(10) == "10")
    }
    'prettyBooleanFormatter3 - {
      assert(Exercises.prettyBooleanFormatter3(true) == "правда")
      assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter3(10) == "10")
    }

    'max1 - {
      assert(Exercises.max1(Seq(1)) == 1)
      assert(Exercises.max1(Seq(1, 10)) == 10)
      assert(Exercises.max1(Seq.empty[Int]) == 0)
    }
    'max2 - {
      assert(Exercises.max2(Seq(1)) == Seq(1))
      assert(Exercises.max2(Seq(1, 10)) == Seq(10))
      assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
    }
    'max3 - {
      assert(Exercises.max3(Seq(1)) == Some(1))
      assert(Exercises.max3(Seq(1, 10)) == Some(10))
      assert(Exercises.max3(Seq.empty[Int]) == None)
    }

    'sum1 - {
      assert(Exercises.sum1(1, 5) == 6)
      assert(Exercises.sum1(10,0) == 10)
      assert(Exercises.sum1(5,5) == 10)
    }
    'sum2 - {
      assert(Exercises.sum2(1, 5) == 6)
      assert(Exercises.sum2(10,0) == 10)
      assert(Exercises.sum2(5,5) == 10)
    }
    'sum3 - {
      assert(Exercises.sum3(1, 5) == 6)
      assert(Exercises.sum3(10,0) == 10)
      assert(Exercises.sum3(5,5) == 10)
    }
  }
}
