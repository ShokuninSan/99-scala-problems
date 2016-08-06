/**
P16 (**) Drop every Nth element from a list.

Example:

scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/
import annotation._

object P16 {

  def drop[T](n: Int, xs: List[T]): List[T] = {
    def _do(i: Int, xs: List[T]): List[T] = xs match {
      case x :: xs =>
        if (i == n) _do(1, xs)
        else x :: _do(i+1, xs)
      case _ => Nil
    }
    _do(1, xs)
  }

  def dropTailRecursive[T](n: Int, xs: List[T]): List[T] = {
    @tailrec
    def _do(i: Int, xs: List[T], acc: List[T]): List[T] = xs match {
      case x :: xs =>
        if (i == n) _do(1, xs, acc)
        else _do(i+1, xs, x :: acc)
      case _ => acc
    }
    _do(1, xs, Nil).reverse
  }

  def dropZipped[T](n: Int, xs: List[T]): List[T] =
    xs.zipWithIndex
    .foldRight(List[T]())((x, acc) =>
      if (((x._2+1) % n) != 0) x._1 :: acc
      else acc)

}
