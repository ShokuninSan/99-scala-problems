package lists

object P02 {

  def penultimateBuiltin[A](l: List[A]): A = if (l.length >= 2) l.init.last else throw new IllegalArgumentException

  def penultimate[A](l: List[A]): A = l match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new IllegalArgumentException
  }

  import shapeless._

  def penultimateShapeless[L <: HList](l: L): Any = l match {
    case x :: _ :: HNil => x
    case _ :: xs => penultimateShapeless(xs)
    case _ => throw new IllegalArgumentException
  }

}
