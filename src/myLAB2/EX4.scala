package myLAB2

object EX4 extends {

  val myFunXYZValWithCurrying = (x: Double ) => (y: Double ) => (z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  val myFunXYZVAl = ( x: Double, y: Double,z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  def myFunXYZDefWithCurrying (x: Double ) (y: Double ) (z: Double): Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  def myFunXYZDef(x: Double, y:Double, z:Double) : Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

}