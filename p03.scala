// Builtin
def nthBuiltin[A](idx: Int, l: List[A]): A = if (idx >=0) l(idx) else throw new NoSuchElementException

def nth[A](idx: Int, l: List[A]): A = l.zipWithIndex.filter(_._2 == idx) match {
  case (v, _) :: Nil => v
  case _ => throw new NoSuchElementException
}

def nthRecursive[A](idx: Int, l: List[A]): A = l match {
  case x :: xs if idx == 0 => x
  case x :: xs => nthRecursive(idx - 1, xs)
  case _ => throw new NoSuchElementException
}
