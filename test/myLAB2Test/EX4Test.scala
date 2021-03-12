package myLAB2Test

import myLAB2.EX4._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX4Test {

  @Test def testCurrying() {

    val testmyFunXYZValWithCurrying = myFunXYZValWithCurrying(1)(2)(3)
    assertTrue(testmyFunXYZValWithCurrying)

    val testmyFunXYZVAl = myFunXYZVAl(1,2,3)
    assertTrue(testmyFunXYZVAl)

    val testmyFunXYZDefWithCurrying = myFunXYZDefWithCurrying(1)(2)(3)
    assertTrue(testmyFunXYZDefWithCurrying)

    val testmyFunXYZDef = myFunXYZDef(1,2,3)
    assertTrue(testmyFunXYZDef)

  }

}