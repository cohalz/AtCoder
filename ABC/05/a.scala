object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    println(in(1)/in(0))
  }
}
