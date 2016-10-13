package scala.exercises

object Assert {
  /*ScalaTest makes three assertions available by default in any style trait. You can use:

    assert for general assertions;
    assertResult to differentiate expected from actual values;
    intercept to ensure a bit of code throws an expected exception.*/
  def main(args: Array[String]) {

    val left = 2
    val right = 1
    assert(left == right)
    //TODO: add scala unit test lib
  }
}