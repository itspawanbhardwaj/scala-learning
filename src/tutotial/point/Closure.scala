package tutotial.point

/*A closure is a function, whose return value 
 * depends on the value of one or more 
 * variables declared outside this function.
*/

object Closure {
  def main(args: Array[String]) {
    println(multiplier(3))
    println(multiplier(4))
  }
  var factor = 3
  val multiplier = (i: Int) => i * factor
}