package myLAB2

object EX7 {

  abstract class Shape

  case class Rectangle(length: Double, height: Double) extends Shape
  case class Circle(radius: Double) extends Shape
  case class Square(side: Double) extends Shape

  object myCalcGeometric {

    def perimeter(myShape: Shape): Double = myShape match {
      case Rectangle(length: Double, height: Double) => (length + height) * 2
      case Circle(radius: Double) => 2 * math.Pi * radius
      case Square(side: Double) => 4 * side
    }

    def area(myShape: Shape): Double = myShape match {
      case Rectangle(length: Double, height: Double) => (length * height)
      case Circle(radius: Double) => math.Pi * radius * radius
      case Square(side: Double) => side * side
    }

  }

}
