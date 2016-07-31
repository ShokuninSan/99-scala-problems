object P05 {

  def reverseBuiltin[A](l: List[A]): List[A] = l.reverse

  import annotation._
  def reverseRecursive[A](l: List[A]): List[A] = {
    @tailrec
    def _do(l1: List[A], r: List[A]): List[A] = l1 match {
      case Nil => r
      case x :: xs => _do(xs, x :: r)
    }
    _do(l, Nil)
  }

  def reverseFoldL[A](l: List[A]): List[A] = l.foldLeft(List.empty[A]) { (acc, e) => e :: acc }

}
