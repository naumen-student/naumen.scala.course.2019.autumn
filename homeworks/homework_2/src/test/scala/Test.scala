import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(34,45) == 237)
    }
    'primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(100) == Seq(2, 5))
      assert(Exercises.primeFactor(69) == Seq(3, 23))
    }
    'test_sumScalars - {
      val leftVec0 = Exercises.Vector2D(1, 0)
      val leftVec1 = Exercises.Vector2D(0, 1)
      val rightVec0 = Exercises.Vector2D(10, 1)
      val rightVec1 = Exercises.Vector2D(1, 10)
      assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 20)
    }
    'test_sumCosines - {
      val leftVec0 = Exercises.Vector2D(50, 0)
      val leftVec1 = Exercises.Vector2D(0, 50)
      val rightVec0 = Exercises.Vector2D(25, 0)
      val rightVec1 = Exercises.Vector2D(0, 25)
      assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 0)
    }
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(
        Map(
          "Lead" -> (10, 11), "Titanium" -> (2, 16.50), "Silver" -> (3, 7.505), "Uranium" -> (9, 14.04),
          "Chrome" -> (4, 3.12), "Cesium" -> (6, 12), "Zirconium" -> (5, 6.4)))
        == Seq("Titanium", "Chrome", "Silver", "Zirconium", "Cesium", "Uranium", "Lead"))
    }
  }
}