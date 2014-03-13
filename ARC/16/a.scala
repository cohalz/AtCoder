object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    println((1 to in(0)).filter(_ != in(1))(0))
  }
}
