package myLAB2Test

import myLAB2.EX6._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX6Test {

  @Test def testFib() {
    assertEquals(0,fib(0))
    assertEquals(1,fib(1))
    assertEquals(1,fib(2))
    assertEquals(2,fib(3))
    assertEquals(3,fib(4))
    assertEquals(5,fib(5))
  }

  @Test def testFibTail() {
    assertEquals(0,fibTail(0))
    assertEquals(1,fibTail(1))
    assertEquals(1,fibTail(2))
    assertEquals(2,fibTail(3))
    assertEquals(3,fibTail(4))
    assertEquals(5,fibTail(5))
  }

}