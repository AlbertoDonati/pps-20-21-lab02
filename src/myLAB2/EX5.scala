package myLAB2

object EX5 extends {

  def comp(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def compGen[A] (f: A => A, g: A => A): A => A = x => f(g(x))

}