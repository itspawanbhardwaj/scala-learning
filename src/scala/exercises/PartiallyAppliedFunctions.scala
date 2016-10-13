package scala.exercises

/*A partially applied function is a function that 
 you do not apply any or
all the arguments, creating another function.*/

object PartiallyAppliedFunctions {

  def sum(a: Int, b: Int, c: Int) = a + b + c

  def customFilter(f: Int => Boolean)(xs: List[Int]) = {
    xs filter f
  }
  def main(args: Array[String]) {
    val sum3 = sum _
    println(sum3(1, 2, 3));

    /*Partially applied functions can replace any number of arguments: */

    val sum4 = sum(2, 3, _: Int)
    println(sum4(6))

    val sumCurried = (sum _).curried
    println(sumCurried(3)(4)(5))

    /*Currying allows you to create specialized version of generalized function */

    val list = List(1, 5, 2, 6, 3, 8, 5)

    val filteredListFunction = customFilter(x => x % 2 == 0) _

    println(filteredListFunction(list))
  }
}