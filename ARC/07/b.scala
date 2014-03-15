object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    val n = in(0)
    val m = in(1)
    var d = new Array[Int](m)
    var tmp = 0
    for(i <- 0 until m) {
      d(i) = readInt
    }
    var c = (0 to n).toArray
    for(i <- 0 until m){
      tmp = c(c.indexOf(d(i)))
      c(c.indexOf(d(i))) = c(0)
      c(0) = tmp
    }
    for(i <- 1 to n){
      println(c(i))
    }
  }
}
