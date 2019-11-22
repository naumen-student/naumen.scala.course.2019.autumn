package homework_3
import utest._
object Test extends TestSuite{
  val tests = Tests{

    'test_prettyBooleanFormatter1 - {
      assert(Exercises.prettyBooleanFormatter1(true) == "правда")
      assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter1(77) == "77")
    }

    'test_prettyBooleanFormatter2 - {
      assert(Exercises.prettyBooleanFormatter2(true) == "правда")
      assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter2(1) == "1")
    }

    'test_prettyBooleanFormatter3 - {
      assert(Exercises.prettyBooleanFormatter3(true) == "правда")
      assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter3(10) == "10")
    }

    'test_max1 - {
      assert(Exercises.max1(Seq(1, 2, 3)) == 3)
      assert(Exercises.max1(Seq(4, 7 ,10)) == 10)
      assert(Exercises.max1(Seq()) == Nil)
    }

    'test_max2 - {
      assert(Exercises.max1(Seq(1, 2, 3)) == 3)
      assert(Exercises.max1(Seq(4, 7 ,10)) == 10)
      assert(Exercises.max1(Seq()) == Nil)
    }

    'test_max3 - {
      assert(Exercises.max1(Seq(1, 2, 3)) == 3)
      assert(Exercises.max1(Seq(4, 7 ,10)) == 10)
      assert(Exercises.max1(Seq()) == Nil)
    }

    'test_sum1 - {
      assert(Exercises.sum1(1, 2) == 3)
      assert(Exercises.sum1(37, 63) == 100)
      assert(Exercises.sum1(15, 15) == 30)
    }

    'test_sum2 - {
      assert(Exercises.sum1(1, 2) == 3)
      assert(Exercises.sum1(37, 63) == 100)
      assert(Exercises.sum1(15, 15) == 30)
    }

    'test_sum3 - {
      assert(Exercises.sum1(1, 2) == 3)
      assert(Exercises.sum1(37, 63) == 100)
      assert(Exercises.sum1(15, 15) == 30)
    }
  }
} 