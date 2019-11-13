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
            assert(Exercises.max1(Seq(25, 67, -30)) == 67)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(22, 25)) == Seq(25))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(25, 67, -30)) == Seq(67))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(22, 25)).contains(25))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(25, 67, -30)).contains(67))
        }

        'test_sum1 - {
            assert(Exercises.sum1(35, 52) == 87)
            assert(Exercises.sum1(7, 7) == 14)
            assert(Exercises.sum1(10004, 29000) == 39004)
        }

        'test_sum2 - {
            assert(Exercises.sum2(33, 54) == 87)
            assert(Exercises.sum2(7, 7) == 14)
            assert(Exercises.sum2(10003, 29000) == 39003)
        }

        'test_sum3 - {
            assert(Exercises.sum3(33, 54) == 87)
            assert(Exercises.sum3(7, 7) == 14)
            assert(Exercises.sum3(10003, 29000) == 39003)
        }
    }
}
