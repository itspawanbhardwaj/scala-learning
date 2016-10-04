package informit.oop.cookbook

class Recipe private (val ingredients: List[String] = List.empty, val directions: List[String] = List.empty) {
  println("ingredients : " + ingredients)

  println("directions : " + directions)

}
/*class Cookbook(val recipes: Map[String, Recipe]) {
  println("recipes  : " + recipes)
  
  // auxillary constructor
  def this() = this(Map.empty)
}*/

object Recipe {
  def make(ingredients: List[String] = List.empty, directions: List[String] = List.empty): Recipe = {
    new Recipe(ingredients, directions)
  }
}

object Cookbook {
  val pbj = Recipe.make(
    List("peanut butter", "jelly", "bread"),
    List("put the peanut butter and jelly on the bread"))

  val bacanoPancakes = Recipe.make(
    List("bacano", "pancakes"),
    List("take some bacano  and put it in a pancake"))

}

/*object testCookbook {
  def main(args: Array[String]) {
    println("working");
    val recipe = new Recipe//(List("peanut butter", "jelly", "bread"), List("put the peanut butter and jelly on the bread"))

    val cookbook = new Cookbook//(Map("p.b. $j," -> recipe));

  }
}*/