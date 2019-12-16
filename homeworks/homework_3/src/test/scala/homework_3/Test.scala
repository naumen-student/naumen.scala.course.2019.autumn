package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_1 - {
            val trueStr = "правда"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(12) == "12")
            assert(Exercises.prettyBooleanFormatter1("text") == "text")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(12) == "12")
            assert(Exercises.prettyBooleanFormatter2("text") == "text")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(12) == "12")
            assert(Exercises.prettyBooleanFormatter3("text") == "text")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
        }

        'test_2 - {
            assert(Exercises.max1(Seq[Int](0, 15, -7, 20)) == 20)
            assert(Exercises.max1(Seq[Int](-1, -2, -9)) == -1)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](0, 15, -7, 20)) == Seq[Int](20))
            assert(Exercises.max2(Seq[Int](-1, -2, -9)) == Seq[Int](-1))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](0, 15, -7, 20)) == Option[Int](20))
            assert(Exercises.max3(Seq[Int](-1, -2, -9)) == Option[Int](-1))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }

        'test_sum - {
            assert(Exercises.sum1(34, 35) == 69)
            assert(Exercises.sum2(100, -99) == 1)
            assert(Exercises.sum3(-25, 20) == -5)
        }
    }
}
