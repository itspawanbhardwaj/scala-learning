package courcera.lecture.two

object HeigherOrderFunction {
  println("Heigher Order Functions")              //> Heigher Order Functions

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int

  def sumInts(a: Int, b: Int): Int = sum((x: Int) => x, a, b)
                                                  //> sumInts: (a: Int, b: Int)Int

  def sumCubes(a: Int, b: Int): Int = sum((x: Int) => x * x * x, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  def sumFacts(a: Int, b: Int): Int = sum(fact, a, b)
                                                  //> sumFacts: (a: Int, b: Int)Int
  def id(x: Int): Int = x                         //> id: (x: Int)Int

  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
                                                  //> fact: (x: Int)Int

  sumInts(2, 5)                                   //> res0: Int = 14
}