package myLAB2

object EX3 extends {

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

}