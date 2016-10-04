package informt.functional.programming

object Example1 {

  val timesTwo = new Function[Int, Int] {
    def apply(a: Int) = a * 2
  }

  //private[this] val timesTwo: Int => Int
  val valTimesTwo = {
    a: Int => a * 2
  }

  def defTimesTwo(a: Int) = a * 2

  val times = {
    (a: Int, b: Int) => a * b
  }

  val timesGeneric: (Int, Int) => Int = _ * _

  def main(args: Array[String]) {
    println(valTimesTwo(2));

    println(defTimesTwo(2));

    val words = List("hello", "scala")

    println(words(0));

    println(words.apply(0));

    val numbers = Map(1 -> "one", 2 -> "two")

    println(numbers(1));

    println(numbers.apply(1));

    println(times(2, 3))
  }
}