package courcera.lecture.four

object ListExamples {
  def main(args: Array[String]) {
    println("List examples")

    val list = List(4, 6, 5, 6, 3, 7, 9, 8, 5, 2, 7, 9, 4, 0, 2, 5, 3, 7, 1)
    print("Heigher order function")
    println("1. map function")
    val mapList = list.map(value => value + value)
    mapList.foreach(println)

    println("2.filter")
    val filterList = list.filter(_ > 6)
    filterList.foreach(println)

    println("3.filter not")
    val notFilterList = list.filterNot(_ > 6)
    notFilterList.foreach(println)

    println("3.partition")
    val (p1, p2) = list.partition(_ % 2 == 0)
    println(p1, p2)

    println("4. take while")
    val takeWhileList = list.takeWhile(_ != 5).toList
    println(takeWhileList)

    println("5. drop while")
    val dropWhileList = list.dropWhile(_ > 2)
    println(dropWhileList)

    println("6. span")
    val (a, b) = list.span(_ % 2 == 0)
    println(a, b)

    println("REDUCTION OF LIST")
    println("reduceLeftList")
    val reduceLeftList = list.reduceLeft((x, y) => x + y)
    println(reduceLeftList);

    println("foldLeftList")
    val foldLeftList = list.foldLeft(0)((x, y) => x + y)
    println(foldLeftList);

    println("Understanding :+, +: , concat , ++")
    val l1 = List(1, 2, 3) ++ List(4, 5, 6)
    println(" ++ : " + l1)

    val l2 = concat(List(1, 2, 3), List(4, 5, 6))
    println(" concat : " + l2)

    val l3 = List(1, 2, 3) :+ 4
    println(" :+ : " + l3)

    val l4 = 4 +: List(1, 2, 3)
    println(" :+ : " + l4)

  }

  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new Exception("List is empty")
    case List(x) => x
    case y :: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case Nil => throw new Exception("List is empty")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case x :: y => x :: concat(y, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y :: ys => reverse(ys) ++ List(y)
  }

  def removeAt[T](xs: List[T], n: Int) = (xs take n) :: (xs drop n + 1)
  class ListExample[T] {
    /* def reduceLeft(op: (T, T) => T): T = this match {
      case Nil => throw new Exception("List is empty")
      case x::xs => xs.foldLeft(x)(op)
    }*/

    /* def foldLeft[U](z:U)(op:(U,T)=>U):U = this match{
      case Nil=> z
      case x::xs => (xs foldLeft op(z,x))(op)
    }*/
  }
}  