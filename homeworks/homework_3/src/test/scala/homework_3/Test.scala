package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            val testCases = Seq(
                TestCase(true, "Правда"),
                TestCase(false, "Ложь"),
                TestCase("Строка", "Строка"),
                TestCase(3, "3"))

            testCases.foreach(testCase => assert(Exercises.prettyBooleanFormatter1(testCase.argument) == testCase.expectedValue))
        }

        'test_prettyBooleanFormatter2 - {
            val testCases = Seq(
                TestCase(true, "Правда"),
                TestCase("Строчечка", "Строчечка"),
                TestCase(3.16, "3.16"))

            testCases.foreach(testCase => assert(Exercises.prettyBooleanFormatter2(testCase.argument) == testCase.expectedValue))
        }

        'test_prettyBooleanFormatter3 - {
            val testCases = Seq(
                TestCase(false, "Ложь"),
                TestCase(2019, "2019"),
                TestCase(List(true, false), "List(true, false)"))

            testCases.foreach(testCase => assert(Exercises.prettyBooleanFormatter3(testCase.argument) == testCase.expectedValue))
        }

        'test_max1 - {
            assert(intercept[UnsupportedOperationException] {
                Exercises.max1(Seq[Int]())
            } != None)
            assert(Exercises.max1(Seq(10)) == 10)
            assert(Exercises.max1(Seq(-4, 16, 15)) == 16)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq[Int]()) == Seq[Int]())
            assert(Exercises.max2(Seq(64)) == Seq(64))
            assert(Exercises.max2(Seq(-4, 10, 0)) == Seq(10))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq[Int]()).isEmpty)
            assert(Exercises.max3(Seq(-15)).get == -15)
            assert(Exercises.max3(Seq(95, 0, 100)).get == 100)
        }

        'sum1 - {
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(5, 10) == 15)
            assert(Exercises.sum1(-3, 1) == -2)
        }

        'sum2 - {
            assert(Exercises.sum2(-995, 995) == 0)
            assert(Exercises.sum2(10, 1) == 11)
            assert(Exercises.sum2(-3, 0) == -3)
        }

        'sum3 - {
            assert(Exercises.sum3(52452, 457529) == 509981)
            assert(Exercises.sum3(0, -100500) == -100500)
            assert(Exercises.sum3(-3, -500) == -503)
        }
    }
}

case class TestCase(argument: Any, expectedValue: String)
