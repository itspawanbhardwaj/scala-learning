package courcera.lecture.five

object MergeSortExample {
  def main(args: Array[String]) {
    println("Merge sort example")
    val list = List(2, 5, 1, 6, 3)
    val sortedList = msort(list)((x: Int, y: Int) => x < y)
    println(sortedList)

    val fruits = List("apple", "pineapple", "orange", "banana")
    val sortedStringList = msort(fruits)((x: String, y: String) => x.compareTo(y) < 0)
    println(sortedStringList)
  }

  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {

    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }
  }

}