/**
P14 (*) Duplicate the elements of a list.

Example:

scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/
object P14 {

  def duplicate[T](xs: List[T]): List[T] = xs match {
    case x :: xs => x :: x :: duplicate(xs)
    case _ => Nil
  }

  def duplicateFolded[T](xs: List[T]): List[T] = xs.foldRight(List[T]())((x,acc) => x :: x :: acc)

  def duplicateFlatMapped[T](xs: List[T]): List[T] = xs.flatMap(x => List(x, x))

}
