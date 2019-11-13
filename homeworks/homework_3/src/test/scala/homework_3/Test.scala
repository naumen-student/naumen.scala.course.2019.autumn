package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(42) == "42")
            assert(Exercises.prettyBooleanFormatter1(-1) == "-1")
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1("str") == "str")
        }

        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(42) == "42")
            assert(Exercises.prettyBooleanFormatter2(-1) == "-1")
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2("str") == "str")
        }

        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(42) == "42")
            assert(Exercises.prettyBooleanFormatter3(-1) == "-1")
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3("str") == "str")
        }

        'max1 - {
            assert(Exercises.max1(Seq(-1, 0, 1, 100)) == 100)
            assert(Exercises.max1(Seq(0)) == 0)
        }

        'max2 - {
            assert(Exercises.max2(Seq(-1, 0, 1, 100)) == Seq(100))
            assert(Exercises.max2(Seq()) == Seq())
        }

        'max3 - {
            assert(Exercises.max3(Seq(-1, 0, 1, 100)) == Option(100))
            assert(Exercises.max3(Seq()).isEmpty)
        }

        'sum1 - {
            assert(Exercises.sum1(0, 1) == 1)
            assert(Exercises.sum1(-1, 0) == -1)
        }

        'sum2 - {
            assert(Exercises.sum2(0, 1) == 1)
            assert(Exercises.sum2(-1, 0) == -1)
        }

        'sum3 - {
            assert(Exercises.sum3(0, 1) == 1)
            assert(Exercises.sum3(-1, 0) == -1)
        }
    }
}
