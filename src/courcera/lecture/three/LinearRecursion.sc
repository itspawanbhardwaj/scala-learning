package courcera.lecture.three

object LinearRecursion {
  println("Heigher order function with tail recursion")
                                                  //> Heigher order function with tail recursion
  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    def loop(a: Int, acc: Int): Int = {

      println("a" + a)

      println("b" + b)

      if (a > b) acc

      else loop(a + 1, f(a) + acc)

    }

    loop(a, 0)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int

  sum(x => x)(2, 5)                               //> a2
                                                  //| b5
                                                  //| a3
                                                  //| b5
                                                  //| a4
                                                  //| b5
                                                  //| a5
                                                  //| b5
                                                  //| a6
                                                  //| b5
                                                  //| res0: Int = 14
}