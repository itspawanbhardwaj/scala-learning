package scala.exercises

/*The next trait from the top in the collections hierarchy is Iterable. 
All methods in this trait are defined in terms of an abstract method, iterator, 
which yields the collection's elements one by one*/
object IterablesExamples {
  def main(args: Array[String]) {

    /*Iterator has two important methods: hasNext, which answers whether 
     * the iterator has another element available. 
     * next which will return the next element in the iterator.*/

    val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    val it = list.iterator
    if (it.hasNext) {
      println(it.next)
    }

    println("grouped will return fixed sized Iterable chucks of an Iterable ")

    val groupedit = list grouped 3
    println(groupedit.next());
    println(groupedit.next());

    println("sliding will return an Iterable that shows a sliding window of an Iterable. ")
    val slidingit = list sliding 3
    println(slidingit.next());
    println(slidingit.next());

    println("sliding can take the size of the window as well the size of the step during each iteration ")
    val slidingit1 = list sliding (3, 3)
    println(slidingit1.next());
    println(slidingit1.next());

    println("zip will stitch two iterables into an iterable of pairs of corresponding elements from both iterables.")
    val xs = List(3, 5, 9)
    val ys = List("Bob", "Ann", "Stella")
    val zippedList = (xs zip ys)
    println(zippedList)

    println("If two Iterables aren't the same size, then zipAll can provide fillers for what it couldn't find a complement for:")
    val xt = List(3, 5)
    val yt = List("Bob", "Ann", "Stella")
    val zippedAllList = (xt zipAll (yt, -1, "?"))
    println(zippedAllList)

    println("zipWithIndex will zip an Iterable with it's integer index ")

    val zipWithIndexIt = xs.zipWithIndex
    println(zipWithIndexIt)

    println("sameElements will return true if the two iterables produce the same elements in the same order: ")
    val xs1 = List("Manny", "Moe", "Jack")
    val ys1 = List("Manny", "Moe", "Jack")
    println(xs1 sameElements ys1)

    val xs2 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys2 = Set(7, 2, 1, 4, 5, 6, 3)
    println(xs2 sameElements ys2)
  }
}