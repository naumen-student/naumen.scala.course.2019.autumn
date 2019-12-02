package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'testBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
            assert(Exercises.prettyBooleanFormatter1('s') == "s")
        }

        'testBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
            assert(Exercises.prettyBooleanFormatter2('s') == "s")
        }

        'testBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
            assert(Exercises.prettyBooleanFormatter3('s') == "s")
        }

        'testMax1 - {
            assert(Exercises.max1(Seq(1, 0)) == 1)
            assert(Exercises.max1(Seq()) == -6969)
            assert(Exercises.max1(Seq(1, 13, 8, 11)) == 13)
        }

        'testMax2 - {
            assert(Exercises.max2(Seq(1, 0)) == Seq(1))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(1, 13, 8, 11)) == Seq(13))
        }

        'testMax3 - {
            assert(Exercises.max3(Seq(1, 0)) == Some(1))
            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(1, 13, 8, 11)) == Some(13))
        }

        'testSum1 - {
            assert(Exercises.sum1(1300, 37) == 1337)
            assert(Exercises.sum1(115, 551) == 666)
            assert(Exercises.sum1(0, 1) == 1)
        }

        'testSum1 - {
            assert(Exercises.sum2(1300, 37) == 1337)
            assert(Exercises.sum2(115, 551) == 666)
            assert(Exercises.sum2(0, 1) == 1)
        }

        'testSum3 - {
            assert(Exercises.sum3(1300, 37) == 1337)
            assert(Exercises.sum3(115, 551) == 666)
            assert(Exercises.sum3(0, 1) == 1)
        }
    }
}
