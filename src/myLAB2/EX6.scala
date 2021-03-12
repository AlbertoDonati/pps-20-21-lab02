package myLAB2

object EX6 {

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
