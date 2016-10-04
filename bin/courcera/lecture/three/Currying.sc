package courcera.lecture.three

object Currying {
  println("Currying")                             //> Currying

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    }
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

  def sumInts = sum(x => x)                       //> sumInts: => (Int, Int) => Int
  def sumCube = sum(x => x * x * x)               //> sumCube: => (Int, Int) => Int

}