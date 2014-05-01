object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    var r = in(0)
    var c = in(1)
    var k = in(2)
    var s = Array.ofDim[Int](r,c)
    for(i <- 0 until r){
      s(i) = readLine.split("").tail
      println(s(i).toString)
    }
  }
}
