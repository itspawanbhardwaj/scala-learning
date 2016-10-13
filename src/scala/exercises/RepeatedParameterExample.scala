package scala.exercises

object RepeatedParameterExample {
  /*A repeated parameter must be the last parameter and 
   * this will let you add as many extra parameters as needed.*/

  def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
    "%d %ss can give you %s".format(x, y, z.mkString(", "))
  }

  def main(args: Array[String]) {
    println(repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol"))
  }
}