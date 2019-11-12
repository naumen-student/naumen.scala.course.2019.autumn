package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(10, 18)) == 18)
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(2, -1, 1)) == 2)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(10, 18)) == Seq(18))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(2, -1, 1)) == Seq(2))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(10, 18)).contains(18))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(2, -1, 1)).contains(2))
        }

        'test_sum1 - {
            assert(Exercises.sum1(1, 5) == 6)
            assert(Exercises.sum1(2, 12) == 14)
            assert(Exercises.sum1(3, 95) == 98)
        }

        'test_sum2 - {
            assert(Exercises.sum2(1, 5) == 6)
            assert(Exercises.sum2(2, 12) == 14)
            assert(Exercises.sum2(3, 95) == 98)
        }

        'test_sum3 - {
            assert(Exercises.sum3(1, 5) == 6)
            assert(Exercises.sum3(2, 12) == 14)
            assert(Exercises.sum3(3, 95) == 98)
        }
    }
}
