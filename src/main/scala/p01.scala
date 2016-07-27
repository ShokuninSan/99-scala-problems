// Builtin
def lastBuiltin[A](l: List[A]): A = l.last

def last[A](l: List[A]): A = l match {
  case x :: Nil => x
  case _ :: xs => last(xs)
  case _ => throw new IllegalArgumentException
}
