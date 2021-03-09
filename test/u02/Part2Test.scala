package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.Part2.{evenOrOdd, neg, neg2, neg3}

class Part2Test {

  @Test def testEvenOrOdd(){
    val a = 3;
    assertEquals("odd", evenOrOdd(a))
  }

  @Test def testNeg() {
    val empty: String => Boolean = _ == ""
    val notEmpty: String=> Boolean = neg(empty)
    val notEmpty2:String=>Boolean = neg2(empty)
    val notEmpty3:String => Boolean = neg3(empty)

    assertFalse(empty("a"))
    assertTrue(empty(""))

    assertTrue(notEmpty("a"))
    assertFalse(notEmpty(""))

    assertTrue(notEmpty2("b"))
    assertFalse(notEmpty2(""))

    assertTrue(notEmpty3("c"))
    assertFalse(notEmpty3(""))

  }




}