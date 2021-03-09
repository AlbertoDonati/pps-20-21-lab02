package u02


object Part2 extends {

  def evenOrOdd (n: Int) : String = n match {
      case n if ((n%2) == 0) => "even"
      case _ => "odd"
      }

  val evenOrOddVal: Int => String = {
    case n if ((n%2) == 0) => "even"
    case _ => "odd"
  }

  val neg: (String => Boolean) => (String => Boolean) = f1 => !f1(_)
  def neg2 (f2: String => Boolean) : String => Boolean = !f2(_)
  def neg3[A](f3: A => Boolean) : A => Boolean = !f3(_)

  def MyFun1 (x: Double, y:Double, z:Double) : Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  def MyFun2 (x: Double ) (y: Double ) (z: Double): Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  val MyFun3 = ( x: Double, y: Double,z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  val MyFun4 = (x: Double ) => (y: Double ) => (z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }



}
