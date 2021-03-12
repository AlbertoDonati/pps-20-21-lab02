package myLAB2Test

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import myLAB2.EX8.Option._

class EX8Test {

  @Test def testOptionFilter() {
    assertEquals(Some(5),filter[Int](Some(5))(_>2))
    assertEquals(None(),filter[Int](Some(5))(_>8))
  }

  /*

  @Test def testOptionMap() {
    assertEquals(Some(true), map (Some(5)) (_>2) )
  }

  @Test def testOptionMap2() {
     map4 (Some(5)>2) (Some(4)>2) )
  }

   */

}