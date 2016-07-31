/**

P07 (**) Flatten a nested list structure.

Example:

scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)

*/

def flatten(xs: List[Any]): List[Any] = xs flatMap {
  case xs: List[Any] => flatten(xs)
  case x => List(x)
}
