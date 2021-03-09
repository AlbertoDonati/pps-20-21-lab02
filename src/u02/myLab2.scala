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

  //@annotation.tailrec
  def fib(n: Int): Int = n match {
    case n if n == 0 => 0
    case n if n == 1 => 1
    case _ => fib(n-1) + fib(n-2)
  }

    @annotation.tailrec
    def fibTail(n: Int, acc1: Int = 0, acc2:Int = 1): Int = n match {
      case n if n == 0 => acc1
      case n if n == 1 => acc2
      case _ => fibTail (n-1, acc2 ,acc1+acc2 )
    }

}