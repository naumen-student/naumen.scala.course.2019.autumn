import utest._

object Test extends TestSuite {

  val tests = Tests {

    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 4) == 3)
      assert(Exercises.sumOfDivBy3Or5(1, 8) == 14)
      assert(Exercises.sumOfDivBy3Or5(1, 50) == 593)
    }

    'test_primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(115) == Seq(5, 23))
    }

    'test_sumScalars - {
      val leftVec0 = Exercises.Vector2D(1, 0)
      val leftVec1 = Exercises.Vector2D(0, 1)
      val rightVec0 = Exercises.Vector2D(-1, 0)
      val rightVec1 = Exercises.Vector2D(2, 0)
      assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == -2)
    }

    'test_sumCosines - {
      val leftVec0 = Exercises.Vector2D(1, 0)
      val leftVec1 = Exercises.Vector2D(0, 1)
      val rightVec0 = Exercises.Vector2D(-1, 0)
      val rightVec1 = Exercises.Vector2D(2, 0)
      assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == -1)
    }

    'test_sortByHeavyweight - {
      val balls: Map[String, (Int, Double)] =
        Map(
          "Aluminum" -> (3, 2.5),
          "Tungsten" -> (2, 19.35),
          "Graphite" -> (12, 2.1),
          "Iron" -> (3, 7.874)
        )
      assert(Exercises.sortByHeavyweight(balls) == Seq(Aluminum, Tungsten, Iron, Graphite))
    }

  }
}