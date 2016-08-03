/**

P08 (**) Eliminate consecutive duplicates of list elements.

If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

*/
trait P08 {

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
    case x :: xs if Some(x) != xs.headOption => x :: compressRecursive(xs)
    case x :: xs => compressRecursive(xs)
  }

}
