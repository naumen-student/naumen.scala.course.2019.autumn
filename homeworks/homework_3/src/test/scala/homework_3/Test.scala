package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1("дед") == "дед")
            assert(Exercises.prettyBooleanFormatter1(100) == "100")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2("дед") == "дед")
            assert(Exercises.prettyBooleanFormatter2(100) == "100")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3("дед") == "дед")
            assert(Exercises.prettyBooleanFormatter3(100) == "100")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](0, 1, 2)) == 2)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](3, 4, 5)) == List(5))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](6, 7, 8)) == Option[Int](8))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum2(3, 4) == 7)
            assert(Exercises.sum3(5, 6) == 11)
        }
    }
}
