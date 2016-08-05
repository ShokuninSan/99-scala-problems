/**
P11 (*) Modified run-length encoding.

Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

Example:

scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*/
object P11 {

  def encodeModified[T](xs: List[T]): List[Any] =
    P10.encode(xs).map(t => if (t._1 == 1) t._2 else t)

}
