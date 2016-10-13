package scala.exercises

/*The actual arguments that are eligible to be passed to 
 * an implicit parameter fall into two categories:
*/

/*
 - First, eligible are all identifiers x that can be accessed at the point of 
 the method call without a prefix and that denote an implicit definition or 
 an implicit parameter. 
 

 - Second, eligible are also all members of companion modules of 
 the implicit parameter's type that are labeled implicit.


- implicit values can not be top-level, they have to be members of a template.

 */

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

object ImplicitsExample extends App {
  implicit object StringMoniod extends Monoid[String] {
    def add(x: String, y: String) = x concat y
    def unit: String = ""
  }

  implicit object IntMoniod extends Monoid[Int] {
    def add(x: Int, y: Int) = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  println(sum(List(1, 2, 3)))
  println(sum(List("a", "b", "c")))
}

 



