package courcera.lecture.five

object ImplecitMergeSortExample {
  def main(args: Array[String]) {
    println("Merge sort example")
    val list = List(2, 5, 1, 6, 3)
    val sortedList = msort(list) //compiler will automatically pass the func based on the required type, 
    //if not found it will give error
    println(sortedList)

    val fruits = List("apple", "pineapple", "orange", "banana")
    val sortedStringList = msort(fruits)
    println(sortedStringList)
  }

  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {

    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd)) // ord func is implicitly passed 
      // must be visible at function call (must be in scope)
    }
  }

}