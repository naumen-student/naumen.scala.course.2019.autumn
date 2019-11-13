package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests {
        val trueStr = "правда"
        val falseStr = "ложь"
        val intResultStr = "1234"

        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1234) == intResultStr)
        }

        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(1234) == intResultStr)
        }

        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(1234) == intResultStr)
        }

        'test_max1 - {
            assert(Exercises.max1(Seq[Int](1, 2, 3)) == 3)
            assert(Exercises.max1(Seq[Int](1, 7, 3)) == 7)
            assert(Exercises.max1(Seq[Int]()) == -1)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq[Int](1, 2, 3)) == Seq(3))
            assert(Exercises.max2(Seq[Int](1, 7, 3)) == Seq(7))
            assert(Exercises.max2(Seq[Int]()) == Seq())
        }

        'test_max3 - {
            assert(Exercises.max3(Seq[Int](1, 2, 3)) == Option(3))
            assert(Exercises.max3(Seq[Int](1, 7, 3)) == Option(7))
            assert(Exercises.max3(Seq[Int]()) == Option.empty)
        }

        'test_sum1 - {
            assert(Exercises.sum1(2, 5) == 7)
            assert(Exercises.sum1(2, 2) == 4)
            assert(Exercises.sum1(-1, 4) == 3)
        }

        'test_sum2 - {
            assert(Exercises.sum2(2, 5) == 7)
            assert(Exercises.sum2(2, 2) == 4)
            assert(Exercises.sum2(-1, 4) == 3)
        }

        'test_sum3 - {
            assert(Exercises.sum3(2, 5) == 7)
            assert(Exercises.sum3(2, 2) == 4)
            assert(Exercises.sum3(-1, 4) == 3)
        }
    }
}
