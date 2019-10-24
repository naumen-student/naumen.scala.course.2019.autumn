import utest._

object Test extends TestSuite{

  val tests = Tests{
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(0, 20) == 88)
    }
    'test_primeFactor - {
      assert(Exercises.primeFactor(9) == Seq(3))
      assert(Exercises.primeFactor(6) == Seq(2, 3))
      assert(Exercises.primeFactor(42) == Seq(2, 3, 7))
    }
    'test_sumScalars - {
      assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(2, 1),
        Exercises.Vector2D(3, 2), Exercises.Vector2D(4, 3)) == 20)
    }
    'test_sumCosines - {
      assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(2, 1),
        Exercises.Vector2D(3, 2), Exercises.Vector2D(4, 3)) == 1.8928875442053283)
    }
    'test_sortByHeavyweight - {
      val balls: Map[String, (Int, Double)] =
        Map(
          "Potassium" -> (14,  0.862), "Magnesium" -> (10,  1.738), "Tin" ->       (1,   7.29),
          "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04)
        )
      assert(Exercises.sortByHeavyweight(balls) == Seq("Tin", "Uranium", "Silver", "Magnesium", "Potassium"))
    }
  }
}
