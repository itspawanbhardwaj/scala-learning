package courcera.lecture.four

object ForLoop {

  def main(args: Array[String]) = {

    println("forloop one")
    for (i: Int <- 1 to 10) println("I AM AWESOME!!")

    println("loop 2")
    val origin = List(1, 2, 3)
    import collection.mutable.MutableList
    val transformed = new MutableList[Int]

    for (i: Int <- 0 until origin.size)
      transformed += origin(i) * 2

    println(transformed)
    transformed.clear

    println("for loop 3")
    for (i <- origin) transformed += i * 2
    println(transformed)

    println("for loop 4 with yield")
    val t = for (i <- origin) yield i * 2

    println(t)

    println("nested loops")
    println(for (i <- List(1, 2, 3); j <- List(4, 5, 6)) yield i * j)

    val nestedLoop = for {
      i <- List(1, 2, 3)
      j <- List(4, 5, 6)
    } yield i * j

    println(nestedLoop)

    println("nested loops with guard")
    val nestedLoopWithGuard = for {
      i <- List(1, 2, 3)
      j <- List(4, 5, 6)
      product = i * j
      if (product % 2 == 0)
    } yield product

    println(nestedLoopWithGuard)
  }

}