import Exercises.Vector2D
import utest._

object Test extends TestSuite{

  val tests = Tests{
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(0, 40) == 408)
      assert(Exercises.sumOfDivBy3Or5(0, 2) == 0)
    }

    'primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(134) == Seq(2, 67))
      assert(Exercises.primeFactor(1) == Seq())
    }

    val leftVec0 = Vector2D(2.53, 0.32)
    val leftVec1 = Vector2D(1.16, 7.02)
    val rightVec0 = Vector2D(8.41, 6.27)
    val rightVec1 = Vector2D(7.63, 1.11)

    val V1 = Vector2D(0, 1)
    val V2 = Vector2D(1, 0)
    val V3 = Vector2D(0, 2)

    'sumScalars - {
      assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 76.3092)
      assert(Exercises.sumScalars(V1, V3, V3, V3) == 6)
      assert(Exercises.sumScalars(V2, V3, V1, V1) == 1)
    }

    'sumCosines - {
      assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 1.1649556818478812)
      assert(Exercises.sumCosines(V1, V3, V3, V3) == 2)
      assert(Exercises.sumCosines(V2, V3, V1, V1) == 1)
    }

    'sortByHeavyweight - {

      assert(Exercises.sortByHeavyweight()
        == Seq("Tin","Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome",
        "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium","Lithium", "Magnesium", "Potassium", "Graphite"))

      assert(Exercises.sortByHeavyweight(
        Map(
          "Uranium" -> (2, 19.04), "Silver" -> (4, 4.505), "Zirconium" -> (3, 6.45),
          "Nickel" -> (2, 8.91), "Potassium" -> (14, 0.862), "Aluminum" -> (3, 2.6889),
          "Chrome" -> (3, 7.18)))
        == Seq("Nickel", "Aluminum", "Uranium", "Zirconium", "Chrome", "Silver", "Potassium"))

      assert(Exercises.sortByHeavyweight(
        Map(
          "Tin" -> (1, 7.29), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45),
          "Nickel" -> (2, 8.91), "Calcium" -> (8, 1.55), "Plutonium" -> (3, 19.25)))
        == Seq("Tin", "Nickel", "Zirconium", "Plutonium", "Cesium", "Calcium"))
    }
  }
}
