package bigdatauniversity.week1

import scala.util.Try
import scala.util.Failure
import scala.util.Success

object OptionsExample {
  def main(args: Array[String]) {
    val option1 = Option("Jamie")
    println(option1);
    println(option1.get);
    println(option1.getOrElse("Jane"));

    val nullOption = Option(null)
    println(nullOption);
    Try(nullOption.get) match {
      case Success(e) => println(e)
      case Failure(_) => println("failed: ")
    }

    println(nullOption.getOrElse("Jane"));

    println(getMiddleName(Option("middle name")))

    println(getMiddleName(Option(null)))

    println("heigher order function  with for")

    option1.map(name => println("Yay, " + name))
    option1.foreach(name => println("Yay, " + name))

    println("for expression and Options")

    val martin = Option("Martin")
    val jane = Option("Jane")

    val forOption = for {
      m <- martin
      j <- jane
    } yield (m + " is fiends with " + j)
    println(forOption);
  }

  def getMiddleName(value: Option[String]): String = {
    value match {
      case Some(middleName) => middleName
      case None => "no middle name"
    }
  }
}