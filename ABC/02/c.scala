object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    val x1 = in(0)
    val y1 = in(1)
    val a = in(2) - x1 
    val b = in(3) - y1 
    val c = in(4) - x1 
    val d = in(5) - y1 
    println( (a*d-b*c).abs /2.0)
  }
}
