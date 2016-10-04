package informit.data.control.flow

object ForExamples {

  def main(args: Array[String]) {
    for (i: Int <- 1 to 10) {
      println("I'M AWESOME!!!")
    }

    val original = List(1, 2, 3)
    val updatedList = for (i <- original) yield 2 * i

    updatedList.foreach(println)

    for {
      i <- List(1, 2, 3)
      j <- List(4, 5, 6)
      product = i * j
      if product % 2 == 0
    } yield product
  }
}