package courcera.lecture.four

object AbstractClasses {
  println("Implementing sets as binary trees")    //> Implementing sets as binary trees
  //new IntSet
  val t1 = new NonEmpty(3, Empty, Empty)          //> t1  : courcera.lecture.four.NonEmpty = {.3.}
  t1.contains(3)                                  //> res0: Boolean = true
  val t2 = t1.incl(4)                             //> t2  : courcera.lecture.four.IntSet = {.3{.4.}}
}

abstract class IntSet {
  def value = "value"
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}

object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def value = "updated value"
  def contains(x: Int): Boolean =
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left.incl(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.incl(x))
    else this

  override def toString = "{" + left + elem + right + "}"

}