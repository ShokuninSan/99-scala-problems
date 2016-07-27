// Builtin
def lengthBuiltin[A](l: List[A]): Int = l.length

def length[A](l: List[A]): Int = l.foldLeft(0) { (a, _) => a + 1 }
