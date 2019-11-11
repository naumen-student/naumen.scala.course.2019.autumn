import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 6) == 14)
            assert(Exercises.sumOfDivBy3Or5(9, 11) == 25)
            assert(Exercises.sumOfDivBy3Or5(3, 12) == 45)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(4161) == Seq(3, 19, 73))
            assert(Exercises.primeFactor(2303) == Seq(7, 47))
            assert(Exercises.primeFactor(999999) == Seq(3, 7, 11, 13, 37))
        }
        'sumScalars - {
            val leftVec0 = Exercises.Vector2D(5, 4)
            val leftVec1 = Exercises.Vector2D(8, 1)
            val rightVec0 = Exercises.Vector2D(6, 4)
            val rightVec1 = Exercises.Vector2D(2, 3)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 68.0)
        }
        'sumCosines - {
            val leftVec0 = Exercises.Vector2D(2, -1)
            val leftVec1 = Exercises.Vector2D(3, 8)
            val rightVec0 = Exercises.Vector2D(0, 6)
            val rightVec1 = Exercises.Vector2D(-2, 4)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 0.7897424064818731)
        }
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Silver" -> (8, 10.5), "Titanium" -> (12, 4.54), "Silicon" -> (1, 2.33),
                    "Iron" -> (2, 7.87),  "Krypton" -> (5, 3.75), "Cerium" -> (15, 6.77)))
              == Seq("Silicon", "Iron", "Krypton", "Silver", "Titanium", "Cerium"))
        }
    }
}
