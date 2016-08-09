package lists

/**
P09 (**) Pack consecutive duplicates of list elements into sublists.

If a list contains repeated elements they should be placed in separate sublists.

Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/
object P09 {

  def pack[T](xs: List[T]) = xs.foldRight(List(List[T]())) {
    (x, xxs) =>
      xxs match {
        case h :: t if h.isEmpty => List(x) :: t
        case h :: t if h.head == x => (x :: h) :: t
        case _ => List(x) :: xxs
      }
  }

}
