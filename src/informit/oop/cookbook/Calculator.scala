package informit.oop.cookbook

import java.util.Stack
import java.lang.IllegalArgumentException

object Calculator {

  def main(args: Array[String]) {

    println("POSTFIX EXPESSION CALCULATION")
    println(calculate("2 4 -"))
    println(calculate("2 4 - 6 + "))

    println(calculate("2 4 - NaN + "))
  }

  trait Operator {
    def operate(lhs: Int, rhs: Int): Int
    def symbol: String
    override def toString: String = symbol
  }

  // trait companion object
  object Operator {
    val operators: Map[String, Operator] =
      Map("+" -> Add,
        "-" -> Subtract,
        "*" -> Multiply,
        "/" -> Divide)

    def unapply(token: String): Option[Operator] =
      operators.get(token)
  }

  // creating case classes of various operator for pattern matching
  case object Add extends Operator {
    def operate(lhs: Int, rhs: Int): Int = lhs + rhs
    def symbol = "+"

  }

  case object Subtract extends Operator {
    def operate(lhs: Int, rhs: Int): Int = lhs - rhs
    def symbol = "-"
  }

  case object Multiply extends Operator {
    def operate(lhs: Int, rhs: Int): Int = lhs * rhs
    def symbol = "*"
  }

  case object Divide extends Operator {
    def operate(lhs: Int, rhs: Int): Int = lhs / rhs
    def symbol = "/"
  }

  object Number {
    def unapply(token: String): Option[Int] =
      {
        try {
          Some(token.toInt)
        } catch {
          case _: NumberFormatException => None
        }
      }
  }

  // this method takes a postfix expression and returns its result
  def calculate(expression: String): Int = {

    val stack = new Stack[Int]
    // pattern matching inside for loop
    for (token <- expression.split(" "))
      token match {
        case Number(num) => stack.push(num) // matching with unapply of Number Object
        case Operator(op) => // matching with unapply of Operator Object
          val rhs = stack.pop
          val lhs = stack.pop
          stack.push(op.operate(lhs, rhs))
        case _ => throw new IllegalArgumentException("Invalid token : " + token)
      }

    stack.pop
  }
}