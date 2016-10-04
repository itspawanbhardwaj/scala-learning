package courcera.lecture.three

object ProductFunction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def product(f: Int => Int, combine: (Int, Int) => Int, acc: Int)(a: Int, b: Int): Int =
    if (a > b) acc
    else
      combine(f(a), product(f, combine, acc)(a + 1, b))
                                                  //> product: (f: Int => Int, combine: (Int, Int) => Int, acc: Int)(a: Int, b: In
                                                  //| t)Int

  product(x => x, (y, z) => y * z, 1)(3, 4)       //> res0: Int = 12

}