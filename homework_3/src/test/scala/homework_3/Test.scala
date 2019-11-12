package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(222) == "222")
            assert(Exercises.prettyBooleanFormatter1("Scala))))") == "Scala))))")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(222) == "222")
            assert(Exercises.prettyBooleanFormatter1("Scala))))") == "Scala))))")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(222) == "222")
            assert(Exercises.prettyBooleanFormatter1("Scala))))") == "Scala))))")
        }

        'test_max1 - {
            assert(Exercises.max3(Seq(20, 0, 12341, 15)) == Option(12341))
            assert(Exercises.max3(Seq(-100000, 0, 257899)) == Option(257899))
            assert(Exercises.max3(Seq(100000, 161265, 999999999)) == Option(999999999))
        }

        'test_max2 - {
            assert(Exercises.max3(Seq(20, 0, 12341, 15)) == Option(12341))
            assert(Exercises.max3(Seq(-100000, 0, 257899)) == Option(257899))
            assert(Exercises.max3(Seq(100000, 161265, 999999999)) == Option(999999999))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(20, 0, 12341, 15)) == Option(12341))
            assert(Exercises.max3(Seq(-100000, 0, 257899)) == Option(257899))
            assert(Exercises.max3(Seq(100000, 161265, 999999999)) == Option(999999999))
        }

        'test_sum1 - {
            assert(Exercises.sum1(5, 3) == 8)
            assert(Exercises.sum1(240, 1248) == 1488)
            assert(Exercises.sum1(150, 172) == 322)
        }

        'test_sum2 - {
            assert(Exercises.sum1(5, 3) == 8)
            assert(Exercises.sum1(240, 1248) == 1488)
            assert(Exercises.sum1(150, 172) == 322)
        }

        'test_sum3 - {
            assert(Exercises.sum1(5, 3) == 8)
            assert(Exercises.sum1(240, 1248) == 1488)
            assert(Exercises.sum1(150, 172) == 322)
        }
    }
}
