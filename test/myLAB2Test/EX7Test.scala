package myLAB2Test

import myLAB2.EX7._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EX7Test {

  @Test def testPerimeter() {
    assertEquals(14,myCalcGeometric.perimeter(Rectangle(3,4)))
    assertNotEquals(-1,myCalcGeometric.perimeter(Circle(3)))
    assertEquals(16,myCalcGeometric.perimeter(Square(4)))
  }

  @Test def testArea() {
    assertEquals(12,myCalcGeometric.area(Rectangle(3,4)))
    assertNotEquals(-1,myCalcGeometric.area(Circle(3)))
    assertEquals(16,myCalcGeometric.area(Square(4)))
  }

}