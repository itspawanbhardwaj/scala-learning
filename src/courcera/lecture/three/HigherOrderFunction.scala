package courcera.lecture.three

object HigherOrderFunction {

  def sum(f: (Int) => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def main(args: Array[String]) {
    println(sum(x => x, 2, 4))
    println(sum(x => x * x, 2, 4))

  }

}