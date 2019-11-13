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
            assert(Exercises.max1(Seq(22, 25)) == 25)
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(25, 28, -30)) == 28)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(22, 25)) == Seq(25))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(25, 28, -30)) == Seq(28))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(22, 25)).contains(25))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(25, 28, -30)).contains(28))
        }

        'test_sum1 - {
            assert(Exercises.sum1(10, 20) == 30)
            assert(Exercises.sum1(2, 2) == 4)
            assert(Exercises.sum1(50100, 19320) == 69420)
        }

        'test_sum2 - {
            assert(Exercises.sum2(10, 20) == 30)
            assert(Exercises.sum2(2, 2) == 4)
            assert(Exercises.sum2(50100, 19320) == 69420)
        }

        'test_sum3 - {
            assert(Exercises.sum3(10, 20) == 30)
            assert(Exercises.sum3(2, 2) == 4)
            assert(Exercises.sum3(50100, 19320) == 69420)
        }
    }
}
