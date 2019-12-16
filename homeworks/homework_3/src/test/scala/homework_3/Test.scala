package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1((2, 5)) == "(2,5)")
        }
    'prettyBooleanFormatter2 - {
        assert(Exercises.prettyBooleanFormatter2(true) == "правда")
        assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
        assert(Exercises.prettyBooleanFormatter2(10) == "10")
    }
    'prettyBooleanFormatter3 - {
        assert(Exercises.prettyBooleanFormatter2(true) == "правда")
        assert(Exercises.prettyBooleanFormatter2(false) == ложь)
        assert(Exercises.prettyBooleanFormatter2("test") == "test")
    }

        'max1 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(1,8,6,20)) == 20)
            assert(Exercises.max1(Seq(5555,34,15,21)) == 5555)
        }
        'max2 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(1,8,6,20)) == 20)
            assert(Exercises.max1(Seq(5555,34,15,21)) == 5555)
        }
        'max3 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(1,8,6,20)) == 20)
            assert(Exercises.max1(Seq(5555,34,15,21)) == 5555)
        }

    'sum1 - {
        assert(Exercises.sum1(1, 7) == 8)
        assert(Exercises.sum1(10,1) == 11)
        assert(Exercises.sum1(5,6) == 11)
    }
    'sum2 - {
        assert(Exercises.sum2(1, 8) == 9)
        assert(Exercises.sum2(10,2) == 12)
        assert(Exercises.sum2(5,2) == 7)
    }
    'sum3 - {
        assert(Exercises.sum3(1, 6) == 7)
        assert(Exercises.sum3(10,3) == 13)
        assert(Exercises.sum3(7,5) == 12)
    }
    }
}