package informit.data.control.flow

import java.util.Stack
import java.lang.IllegalArgumentException

object PostfixCalculator {

  def main(args: Array[String]) {
    println(calculate("2 4 -"))
  }

  def handelOperator(token: String, stack: Stack[Int]): Boolean = {
    token match {
      case "+" => {
        println("operator is : " + token)
        val rhs = stack.pop()
        val lhs = stack.pop()
        stack.push(lhs + rhs)
        true
      }

      case "-" => {
        println("operator is : " + token)
        val rhs = stack.pop()
        val lhs = stack.pop()
        stack.push(lhs - rhs)
        true
      }
      case "*" => {
        println("operator is : " + token)
        val rhs = stack.pop()
        val lhs = stack.pop()
        stack.push(lhs * rhs)
        true
      }
      case "/" => {
        println("operator is : " + token)
        val rhs = stack.pop()
        val lhs = stack.pop()
        stack.push(lhs / rhs)
        true
      }
      case _ => false
    }
  }

  /**
   * @param token
   * @param stack
   * @return
   */
  def handleNumber(token: String, stack: Stack[Int]): Boolean = {
    token match {

      case _ => try {
        println("number : " + token.toInt)
        stack.push(token.toInt)
        true
      } catch {
        case _: NumberFormatException => false
      }
    }
  }

  def calculate(expression: String): Int = {

    val stack = new Stack[Int]
    for (token <- expression.split(" "))
      if (!handleNumber(token, stack) && !handelOperator(token, stack))
        throw new IllegalArgumentException("invalid token : " + token)

    stack.pop
  }
}