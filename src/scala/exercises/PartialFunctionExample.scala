package scala.exercises

/*A partial function is a trait that when implemented can be used as building blocks to determine a solution. 
 * The trait PartialFunction requires that the method isDefinedAt and apply be implemented.*/
object PartialFunctionExample {
  val doubleEvens: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x: Int) = x % 2 == 0
    def apply(v1: Int) = v1 * 2
  }

  val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x: Int) = x % 2 != 0
    def apply(v1: Int) = v1 * 3
  }

  val whatToDo = doubleEvens orElse tripleOdds

  /*Case statements are a quick way to create partial functions*/

  val doubleEvens1: PartialFunction[Int, Int] = {
    case x if (x % 2) == 0 => x * 2
  }

  val printEven: PartialFunction[Int, String] = {
    case x if (x % 2) == 0 ⇒ "Even"
  }
  val printOdd: PartialFunction[Int, String] = {
    case x if (x % 2) != 0 ⇒ "Odd"
  }

  val numeberTypeIs = printEven orElse printOdd
  def main(args: Array[String]) {
    println(whatToDo(2))
    println(doubleEvens1(2))

    println(numeberTypeIs(3))
    println(numeberTypeIs(4))
  }
}