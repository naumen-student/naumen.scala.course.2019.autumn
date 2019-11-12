package homework_3

import utest._

object Test extends TestSuite{

  val tests = Tests{
    val trueStr = "правда"
    val falseStr= "ложь"

    'prettyBooleanFormatter1 - {
      assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter1(2561) == "2561")
      assert(Exercises.prettyBooleanFormatter1(256.2566661) == "256.2566661")
      assert(Exercises.prettyBooleanFormatter1("Hello") == "Hello")
    }
    'prettyBooleanFormatter2 - {
      assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter2(2561) == "2561")
      assert(Exercises.prettyBooleanFormatter2(256.2566661) == "256.2566661")
      assert(Exercises.prettyBooleanFormatter2("Hello") == "Hello")
    }

    'prettyBooleanFormatter3 - {
      assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter3(2561) == "2561")
      assert(Exercises.prettyBooleanFormatter3(256.2566661) == "256.2566661")
      assert(Exercises.prettyBooleanFormatter3("Hello") == "Hello")
    }

    'max1 - {
      assert(Exercises.max1(Seq[Int](1, 6, 2)) == 6)
      assert(Exercises.max1(Seq[Int]()) == -1)
      assert(Exercises.max1(Seq[Int](-2, -5, -3)) == -2)
    }

    'max2 - {
      assert(Exercises.max2(Seq[Int](1, 6, 2)) == Seq[Int](6))
      assert(Exercises.max2(Seq[Int]()) == Nil)
      assert(Exercises.max2(Seq[Int](-2, -5, -3)) == Seq[Int](-2))
    }

    'max3 - {
      assert(Exercises.max3(Seq[Int](1, 6, 2)) ==  Option[Int](6))
      assert(Exercises.max3(Seq[Int]()) == None)
      assert(Exercises.max3(Seq[Int](-2, -5, -3)) ==  Option[Int](-2))
    }

    'sum1 - {
      assert(Exercises.sum1(4, 3) == 7)
      assert(Exercises.sum1(-4, -10) == -14)
      assert(Exercises.sum1(0, 43) == 43)
    }

    'sum2 - {
      assert(Exercises.sum2(4, 3) == 7)
      assert(Exercises.sum2(-4, -10) == -14)
      assert(Exercises.sum2(0, 43) == 43)
    }

    'sum3 - {
      assert(Exercises.sum3(4, 3) == 7)
      assert(Exercises.sum3(-4, -10) == -14)
      assert(Exercises.sum3(0, 43) == 43)
    }
  }
}
