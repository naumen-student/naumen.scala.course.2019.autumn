import utest._

import scala.runtime.Nothing$

object Test extends TestSuite{

  val tests = Tests{ }

  val xEqualsTrue = Tests{

    val x = true;

    'xIsTrue1 - {
      assert(Exercises.prettyBooleanFormatter1(x) == "pravda");
    }

    'xIsTrue2 - {
      assert(Exercises.prettyBooleanFormatter2(x) == "pravda");
    }

    'xIsTrue3 - {
      assert(Exercises.prettyBooleanFormatter3(x) == "pravda");
    }
  }

  val xEqualsFalse = Tests{

    val x = false;

    'xIsFalse1 - {
      assert(Exercises.prettyBooleanFormatter1(x) == "lozh");
    }

    'xIsFalse2 - {
      assert(Exercises.prettyBooleanFormatter2(x) == "lozh");
    }

    'xIsFalse3 - {
      assert(Exercises.prettyBooleanFormatter3(x) == "lozh");
    }
  }


  val xIsInt1 = Tests{

    val x:Int = 1;

    'xIsInt1 - {
      assert(Exercises.prettyBooleanFormatter1(x) == "1");
    }

    'xIsInt2 - {
      assert(Exercises.prettyBooleanFormatter2(x) == "1");
    }

    'xIsInt3 - {
      assert(Exercises.prettyBooleanFormatter3(x) == "1");
    }
  }


  val xIsStringKek = Tests {

    val x = "Kek";

    'xIsKek1 - {
      assert(Exercises.prettyBooleanFormatter1(x) == "Kek");
    }

    'xIsKek2 - {
      assert(Exercises.prettyBooleanFormatter2(x) == "Kek");
    }

    'xIsKek3 - {
      assert(Exercises.prettyBooleanFormatter3(x) == "Kek");
    }
  }

  val thereIsntX = Tests{
    'thereIsntX1 - {
      assert(Exercises.prettyBooleanFormatter1() == "()");
    }

    'thereIsntX2 - {
      assert(Exercises.prettyBooleanFormatter2() == "()");
    }

    'thereIsntX3 - {
      assert(Exercises.prettyBooleanFormatter3() == "()");
    }

  }

  val oneElInSeq = Tests{

    val testSeq = Seq[Int] (2);

    'oneElInSeq1 - {
      assert(Exercises.max1(testSeq) == 2);
    }

    'oneElInSeq2 - {
      assert(Exercises.max2(testSeq) == Seq[Int](2));
    }

    'oneElInSeq3 - {
      assert(Exercises.max3(testSeq) == Some(2));
    }
  }


  val sameElInSeq = Tests{

    val testSeq = Seq[Int](2,2,2);

    'sameElInSeq - {
      assert(Exercises.max1(testSeq) == 2);
    }

    'oneElInSeq2 - {
      assert(Exercises.max2(testSeq) == Seq[Int](2));
    }

    'oneElInSeq3 - {
      assert(Exercises.max3(testSeq) == Some(2));
    }
  }


  val emptySeq = Tests{

    val testSeq = Seq[Int]();

    'emptySeq2 - {
      assert(Exercises.max2(testSeq) == Seq[Int]());
    }

    'emptySeq3 - {
      assert(Exercises.max3(testSeq) == None);
    }
  }

  val SumWithoutMinus = Tests{

    val x = 2;
    val y = 2;

    'SumWithoutMinus1 - {
      assert(Exercises.sum1(x,y) == 4);
    }

    'SumWithoutMinus2 - {
      assert(Exercises.sum2(x,y) == 4);
    }

    'SumWithoutMinus3 - {
      assert(Exercises.sum3(x,y) == 4);
    }

  }


  val SumWithMinus = Tests{

    val x = 2;
    val y = -2;

    'SumWithMinus1 - {
      assert(Exercises.sum1(x,y) == 0)
    }

    'SumWithMinus2 - {
      assert(Exercises.sum2(x,y) == 0)
    }

    'SumWithMinus3 - {
      assert(Exercises.sum3(x,y) == 0)
    }

  }
}
