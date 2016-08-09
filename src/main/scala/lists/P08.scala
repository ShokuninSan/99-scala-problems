package lists

/**

P08 (**) Eliminate consecutive duplicates of list elements.

If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

*/
import annotation._

object P08 {

  def compress[T](xs: List[T]): List[T] = {
    var last = xs.head
    var l = List(last)
    for (i <- xs.tail) {
      if (i != last) {
        l = i :: l
        last = i
      }
    }
    l.reverse
  }

  def compressRecursive[T](xs: List[T]): List[T] = xs match {
    case x :: xs =>
      if(xs.headOption == Some(x)) compressRecursive(xs)
      else x :: compressRecursive(xs)
    case _ => Nil
  }

  def compressTailRecursive[T](l: List[T]): List[T] = {
    @tailrec
    def _do(xs: List[T], acc: List[T]): List[T] = xs match {
      case x :: xs =>
        if(xs.headOption == Some(x)) _do(xs, acc)
        else _do(xs, x :: acc)
      case _ => acc.reverse
    }
    _do(l, Nil)
  }

}
