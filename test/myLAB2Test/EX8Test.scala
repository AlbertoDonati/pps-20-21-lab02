package myLAB2Test

import myLAB2.EX8.Option._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX8Test {

  @Test def testOptionFilter() {
    assertEquals(Some(5), filter[Int](Some(5))(_ > 2))
    assertEquals(None(), filter[Int](Some(5))(_ > 8))
  }

  @Test def testOptionMap() {
    assertEquals(Some(true), map[Int](Some(5))(_ > 2))
    assertEquals(None(), map[Int](None[Int])(_ > 2))
  }

  @Test def testOptionMap2() {
    assertEquals(Some(5), map2(Some(5))(Some(2))((value, _) => value))
    assertEquals(None(), map2(Some(5))(None())((value, _) => value))
  }

}