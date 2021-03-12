package myLAB2Test

import myLAB2.EX3._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX3Test {

  @Test def testEvenOrOdd(){
    val a = 3;
    assertEquals("odd", evenOrOdd(a));
    val b = 6;
    assertEquals("even",evenOrOddVal(b));
  }

  @Test def testNeg() {

    val empty: String => Boolean = _ == ""
    val notEmptyVal: String=> Boolean = negVal(empty)
    val notEmptyDef:String=>Boolean = negDef(empty)
    val notEmptyDefGen:String => Boolean = negDefGen(empty)

    assertFalse(empty("z"))
    assertTrue(empty(""))

    assertTrue(notEmptyVal("a"))
    assertFalse(notEmptyVal(""))

    assertTrue(notEmptyDef("b"))
    assertFalse(notEmptyDef(""))

    assertTrue(notEmptyDefGen("c"))
    assertFalse(notEmptyDefGen(""))

  }

}