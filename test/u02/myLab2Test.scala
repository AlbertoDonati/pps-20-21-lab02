package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.myLab2._

class myLab2Test {

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

  @Test def testCurrying() {
    val testmyFunXYZDef = myFunXYZDef(1,2,3)
    assertTrue(testmyFunXYZDef)

    val testmyFunXYZDefWithCurrying = myFunXYZDefWithCurrying(1)(2)(3)
    assertTrue(testmyFunXYZDefWithCurrying)

    val testmyFunXYZVAl = myFunXYZVAl(1,2,3)
      assertTrue(testmyFunXYZVAl)

    val testmyFunXYZValWithCurrying = myFunXYZValWithCurrying(1)(2)(3)
      assertTrue(testmyFunXYZValWithCurrying)

  }


  @Test def testComp() {
  assertEquals(9, comp(_-1, _*2)(5))
}

@Test def testCompGen(): Unit = {
  assertEquals(9, compGen[Int](_-1, _*2)(5))
  assertEquals("casa1ciao", compGen[String](_+"ciao", _+"1")("casa"))
}


}