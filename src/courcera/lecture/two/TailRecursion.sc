package courcera.lecture.two

object TailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def gcd(x: Int, y: Int): Int =
    if (y == 0) x
    else
      gcd(y, x % y)                               //> gcd: (x: Int, y: Int)Int

  gcd(14, 21)                                     //> res0: Int = 7

  def factorial(x: Int): Int =
    if (x == 0) 1
    else
      x * factorial(x - 1)                        //> factorial: (x: Int)Int

  factorial(4)                                    //> res1: Int = 24

  def factorialTailRecursion(x: Int): Int = {
    def loop(acc: Int, x: Int): Int =
      if (x == 0) acc
      else
        loop(acc * x, x - 1)

    loop(1, x)
  }                                               //> factorialTailRecursion: (x: Int)Int

  factorialTailRecursion(4)                       //> res2: Int = 24

}