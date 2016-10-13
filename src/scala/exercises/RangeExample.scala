package scala.exercises
/*
A range's upper bound is not inclusive: 
*/ object RangeExample {
  def main(args: Array[String]) {

    val someNumbers = Range(0, 10)
    val second = someNumbers(1)
    val last = someNumbers.last

    val otherRange = 0 until 10

    /*Range can specify a step for an increment: */

    val example3 = Range(2, 10, 3)
    val second3 = example3(1)
    val last3 = example3.last
    println(example3)
    println(second3)
    println(last3)

    /* A range does not include its upper bound, even in a step increment:*/
    val example4 = Range(0, 34, 2)

    println(example4.contains(33))
    println(example4.contains(32))
    println(example4.contains(34))

    /*Range can specify to include its upper bound value */

    val example5 = Range(0, 34).inclusive

    println(example5.contains(34))
    /*Inclusive ranges can be specified using 'to'. */
    val example6 = 0 to 34
  }
}