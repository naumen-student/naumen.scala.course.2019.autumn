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
            assert(Exercises.prettyBooleanFormatter1(3) == "3")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(3) == "3")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(3) == "3")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(2, 23)) == 23)
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(25, 28, -30)) == 28)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(2, 24)) == Seq(24))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(2, 43, -3)) == Seq(43))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(22, 25)).contains(25))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(25, 28, -30)).contains(28))
        }

        'test_sum1 - {
            assert(Exercises.sum1(45, 940) == 985)
            assert(Exercises.sum1(100, -100) == 0)
            assert(Exercises.sum1(62000, 23220) == 85220)
        }

        'test_sum2 - {
            assert(Exercises.sum1(45, 940) == 985)
            assert(Exercises.sum1(100, -100) == 0)
            assert(Exercises.sum1(62000, 23220) == 85220)
        }

        'test_sum3 - {
            assert(Exercises.sum1(45, 940) == 985)
            assert(Exercises.sum1(100, -100) == 0)
            assert(Exercises.sum1(62000, 23220) == 85220)
        }
    }
}
