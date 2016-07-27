// Builtin
def reverseBuiltin[A](l: List[A]): List[A] = l.reverse

// Tail recursive version
import annotation._
def reverseRecursive[A](l: List[A]): List[A] = {
  @tailrec
  def _do(l1: List[A], r: List[A]): List[A] = l1 match {
    case Nil => r
    case x :: xs => _do(xs, x :: r)
  }
  _do(l, Nil)
}

// Fold
def reverseFoldL[A](l: List[A]): List[A] = l.foldLeft(List.empty[A]) { (acc, e) => e :: acc }
