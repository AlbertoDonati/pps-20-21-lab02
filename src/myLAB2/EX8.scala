package myLAB2

object EX8 {

  sealed trait Option[A]

  object Option {

    case class None[A]() extends Option[A]
    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    def filter[A](opt2: Some[A])(predicate: A => Boolean): Option[A] = opt2 match {
      case Some(a) if predicate(a) => Some(a)
      case _ => None()
    }

    def map[A](opt3: Option[A])(opt4: A => Boolean): Option[Boolean] = opt3 match {
      case Some(a) if opt4(a) => Some(true)
      case _ => None()
    }

    def map2[A](opt5: Option[A])(opt6: Option[A])(f: (Option[A],Option[A]) => Option[A]): Option[A] = (opt5,opt6) match {
      case (opt5,opt6) if ( opt5==None() || opt6==None()) => None()
      case _ => f(opt5,opt6)
    }

  }

}
