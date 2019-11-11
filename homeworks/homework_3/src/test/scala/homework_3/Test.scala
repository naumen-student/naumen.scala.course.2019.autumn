package homework_3

import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_1 - {
      val trueStr = "правда"
      val falseStr = "ложь"
      assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter1(1234) == "1234")
      assert(Exercises.prettyBooleanFormatter1(12.5) == "12.5")
      assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter2(12.5) == "12.5")
      assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
      assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
      assert(Exercises.prettyBooleanFormatter3(1234) == "1234")
      assert(Exercises.prettyBooleanFormatter3(12.5) == "12.5")
    }
      'test_2 - {
          val thrown = intercept[Exception]{ Exercises. max1(List())}
          assert(Exercises. max1(List(1,2,0,56,23456) ) == 23456)
          assert(Exercises. max1(List(-5, -4, -786786, -234) ) == -4)
          assert(Exercises. max1(List(0)) == 0)
          assert(thrown != None)
          assert(Exercises. max2(List(1,2,0,56,23456) ) == List(23456))
          assert(Exercises. max2(List(-5, -4, -786786, -234) ) == List(-4))
          assert(Exercises. max2(List(0)) == List(0))
          assert(Exercises. max2(List()) == List())
          assert(Exercises. max3(List(1,2,0,56,23456) ) == Some(23456))
          assert(Exercises. max3(List(-5, -4, -786786, -234) ) == Some(-4))
          assert(Exercises. max3(List(0)) == Some(0))
          assert(Exercises. max3(List()) == None)
      }
      'test_3 - {
          assert(Exercises. sum1(2,2) == 4)
          assert(Exercises. sum1(5,5) == 10)
          assert(Exercises. sum1(-3,5) == 2)
          assert(Exercises. sum1(-9,-9) == -18)
          assert(Exercises. sum1(0,0) == 0)
          assert(Exercises. sum2(2,2) == 4)
          assert(Exercises. sum2(5,5) == 10)
          assert(Exercises. sum2(-3,5) == 2)
          assert(Exercises. sum2(-9,-9) == -18)
          assert(Exercises. sum2(0,0) == 0)
          assert(Exercises. sum3(2,2) == 4)
          assert(Exercises. sum3(5,5) == 10)
          assert(Exercises. sum3(-3,5) == 2)
          assert(Exercises. sum3(-9,-9) == -18)
          assert(Exercises. sum3(0,0) == 0)
      }
  }
}
