package courcera.lecture.three

object Currying {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  def sum1(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sum1(f)(a + 1, b)
  }

  def sumInt(a: Int, b: Int) = sum(x => x)(a, b)
  def sumCubes(a: Int, b: Int) = sum(x => x * x * x)(a, b)

  def productF(f: Int => Int): (Int, Int) => Int = {
    def product(a: Int, b: Int): Int =
      if (a > b) 1
      else f(a) * product(a + 1, b)
    product
  }
  def main(args: Array[String]) {
    val ss = productF(x => x)(1, 3)
    println(ss)
  }
}