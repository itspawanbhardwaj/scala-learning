package informit.oop.cookbook

class RecipeClass(val ingredients: List[String], val directions: List[String])

object RecipeClass {
  def apply(ingredients: List[String], directions: List[String]): RecipeClass = new RecipeClass(ingredients, directions)

  def unapply(recipe: RecipeClass): Option[(List[String], List[String])] =
    Some(recipe.ingredients, recipe.directions)

}

object Even {
  def unapply(n: Int): Option[(Int)] =
    if (n % 2 == 0) Some(n / 2) else None

}

object RecipeEcample {

  val pbj = RecipeClass(List(""), List(""))

  def main(args: Array[String]) {

    pbj match {
      case RecipeClass(ingredients, directions) => { println(ingredients); println(ingredients) }
    }

    pbj match {
      case RecipeClass(_, List(_)) => {}
    }

    4 match {
      case Even(half) => println(half)
    }

    3 match {
      case Even(half) => println(half)
    }

  }
}

