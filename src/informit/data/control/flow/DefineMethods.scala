package informit.data.control.flow

object DefineMethods {

  def add(a: Int, b: Int): Int = a + b

  //1 1 2 3 5
  def fib(n: Int): Int =
    if (n == 1 || n == 2) 1
    else fib(n - 1) + fib(n - 2)

  def printHello() = println("hello")

  def printHello1 = println("hello")

  def main(args: Array[String]) {
    println(fib(5))
    printHello
    printHello()
    printHello1
    //printHello1() :  Unit does not take parameters
  }

}