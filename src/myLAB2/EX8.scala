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


      //questi boh?
    //case class None[B]() extends Option[B]
    //case class Some[B](b: B) extends Option[B]


    // pure questi cosa sono ??

/*
    def map3[A](opt3: Some[A])(predicate: A => Some(Boolean): Some[Boolean] = opt3 match {
      case Some(a) if(predicate(a)) => Some(Boolean)
      case _ => null
    }*/

    /*
    def map3[A,B](opt3: Some(a))(f: Some[A]=> Some[a]): Some[Boolean] = opt3 match {
       case Some(a) if (Some(a)== true) => Some(true)
         case _ => null

    }*/

    def map[A,B] (opt2: Some[A])(predicate: Option[A] => Some[B]): Option[A] = opt2 match {
      case Some(a) => Some[B]
      case _ => None()
    }


    case class Some2[B](b: B) extends Option[B]

      def map2[A,B] (opt3: Some[A] => Boolean)(opt4: Some2[B] => Boolean): (Option[A],Option[B]) = (opt3,opt4) match {
      //  case Some(a),Some(b) if ((opt3) || (opt4)) => Some[a],Some(b)

        case (Some(a),Some2(b)) if (opt3==opt4) => (Some(a),Some2(b))
        case _ => null
      }

    def map3[A,B] (opt3: Some[A] => Boolean)(opt4: Some2[B] => Boolean): (Option[A],Option[B]) = (opt3,opt4) match {
      //  case Some(a),Some(b) if ((opt3) || (opt4)) => Some[a],Some(b)

      case (Some(a),Some2(b)) if (opt3==true && opt4==true) => (Some(a),Some2(b))
      case _ => null
    }

    def map4[A,B] (opt3: Some[A] => Boolean)(opt4: Some[B] => Boolean): (Option[A],Option[B]) = (opt3,opt4) match {
      //  case Some(a),Some(b) if ((opt3) || (opt4)) => Some[a],Some(b)

      case (Some(a),Some2(b)) if (opt3==true && opt4==true) => (Some(a),Some2(b))
      case _ => null
    }



  }

}
