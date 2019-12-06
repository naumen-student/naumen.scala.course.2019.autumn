import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(2,66) == 1064)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(24) == Seq(2, 3))
            assert(Exercises.primeFactor(526) == Seq(2, 263))
            assert(Exercises.primeFactor(525) == Seq(3, 5, 7))
        }

        'test_sumByFunc - {
          var leftVec0 = Exercises.Vector2D(5, 4);
          var leftVec1 = Exercises.Vector2D(8, 1);
          var rightVec0 = Exercises.Vector2D(6, 4);
          var rightVec1 = Exercises.Vector2D(2, 3);
          assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 68.0)
          assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 1.7753996517255888)

          var lVec0 = Exercises.Vector2D(5.1, 4.8);
          var lVec1 = Exercises.Vector2D(8.3, 1.9);
          var rVec0 = Exercises.Vector2D(6.5, 4.8);
          var rVec1 = Exercises.Vector2D(2.5, 3.4);
          assert(Exercises.sumScalars(lVec0, lVec1, rVec0, rVec1) == 84.02)
          assert(Exercises.sumCosines(lVec0, lVec1, rVec0, rVec1) == 1.8179035966741472)
        }

        'test_sortByHeavyweight - {
          assert(Exercises.sortByHeavyweight(
            Map("Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35),
              "Graphite" ->  (12,  2.1),   "Iron" -> (3,   7.874))) == Vector("Aluminium", "Tungsten", "Iron", "Graphite"))
          assert(Exercises.sortByHeavyweight(Exercises.balls) == Vector("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead",
            "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium",
            "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
      }
    }
}
