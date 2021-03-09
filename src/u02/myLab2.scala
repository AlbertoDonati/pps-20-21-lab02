package u02


object myLab2 extends {

  def evenOrOdd (n: Int) : String = n match {
      case n if ((n%2) == 0) => "even"
      case _ => "odd"
      }

  val evenOrOddVal: Int => String = {
    case n if ((n%2) == 0) => "even"
    case _ => "odd"
  }

  val negVal: (String => Boolean) => (String => Boolean) = f1 => !f1(_)
  def negDef (f2: String => Boolean) : String => Boolean = !f2(_)
  def negDefGen[A](f3: A => Boolean) : A => Boolean = !f3(_)

  def myFunXYZDef(x: Double, y:Double, z:Double) : Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  def myFunXYZDefWithCurrying (x: Double ) (y: Double ) (z: Double): Boolean = (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  val myFunXYZVAl = ( x: Double, y: Double,z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  val myFunXYZValWithCurrying = (x: Double ) => (y: Double ) => (z: Double) => (x,y,z) match {
    case (x,y,z) if (x<=y && y<=z) => true
    case _ => false
  }

  def comp(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def compGen[A] (f: A => A, g: A => A): A => A = x => f(g(x))

}