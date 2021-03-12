package myLAB2Test

import myLAB2.EX5._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX5Test {

  @Test def testComp() {
    assertEquals(9, comp(_-1, _*2)(5))
  }

  @Test def testCompGen() {
    assertEquals(9, compGen[Int](_-1, _*2)(5))
    assertEquals("casa1ciao", compGen[String](_+"ciao", _+"1")("casa"))
  }

}