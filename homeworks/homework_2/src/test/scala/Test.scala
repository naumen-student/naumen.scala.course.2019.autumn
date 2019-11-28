import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(0, 20) == 98)
    }

    'primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(2255) == Seq(5, 11, 41))
    }

    'sumCosines - {
      val leftVec0 = Exercises.Vector2D(0, 3)
      val leftVec1 = Exercises.Vector2D(-3, 1)
      val rightVec0 = Exercises.Vector2D(-2, -10)
      val rightVec1 = Exercises.Vector2D(8, -1)
      assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == -3)
      assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 0.31622776601683794 - 0.07297563831157798)

    }
    'sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(
        Map(
          "Aluminum" -> (3, 2.6889), "Gold" -> (2, 19.32), "Chrome" -> (3, 7.18)))
        == Seq("Aluminum", "Gold", "Chrome"))
    }
  }
}
