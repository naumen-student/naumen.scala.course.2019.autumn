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
            assert(Exercises.prettyBooleanFormatter2(2) == "2")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(3) == "3")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(2, 123)) == 123)
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(15, 90, -300)) == 90)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(10, 204)) == Seq(204))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(6, 423, -30)) == Seq(423))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(9, 36)).contains(36))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(2, 45, -90)).contains(45))
        }

        'test_sum1 - {
            assert(Exercises.sum1(4, 54) == 58)
            assert(Exercises.sum1(90, -91) == -1)
            assert(Exercises.sum1(1, 1) == 2)
        }

        'test_sum2 - {
            assert(Exercises.sum1(4, 54) == 58)
            assert(Exercises.sum1(90, -91) == -1)
            assert(Exercises.sum1(1, 1) == 2)
        }

        'test_sum3 - {
            assert(Exercises.sum1(4, 54) == 58)
            assert(Exercises.sum1(90, -91) == -1)
            assert(Exercises.sum1(1, 1) == 2)
        }
    }
}