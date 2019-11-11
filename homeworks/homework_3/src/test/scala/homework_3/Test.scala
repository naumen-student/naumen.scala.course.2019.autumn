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
    }
}

case class TestCase(argument: Any, expectedValue: String)
