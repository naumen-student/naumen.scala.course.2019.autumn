package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1("test") == "test")
        }
        'test_prettyBooleanFormatter2 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2("test") == "test")
        }
        'test_prettyBooleanFormatter3 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2("test") == "test")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(2,6,5,22)) == 22)
            assert(Exercises.max1(Seq(5354353,33,55,1)) == 5354353)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(2,6,5,22)) == Seq(22))
            assert(Exercises.max2(Seq(5354353,33,55,1)) == Seq(5354353))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(2,6,5,22)) == Some(22))
            assert(Exercises.max3(Seq(5354353,33,55,1)) == Some(5354353))
        }

        'test_sum1 - {
            assert(Exercises.sum1(0,0) == 0)
            assert(Exercises.sum1(2,8) == 10)
            assert(Exercises.sum1(5,-5) == 0)
        }
        'test_sum2 - {
            assert(Exercises.sum2(0,0) == 0)
            assert(Exercises.sum2(2,8) == 10)
            assert(Exercises.sum2(5,-5) == 0)
        }
        'test_sum3 - {
            assert(Exercises.sum3(0,0) == 0)
            assert(Exercises.sum3(2,8) == 10)
            assert(Exercises.sum3(5,-5) == 0)
        }

    }
}
