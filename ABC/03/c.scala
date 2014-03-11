object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    val n = in(0)
    val k = in(1)
    var rate = 0.0
    var r = readLine.split(" ").map(_.toInt).sorted.reverse.take(k).reverse
    for(i <- 0 until r.length){
      rate = (rate+r(i))/2.0
    }
    println(rate)
  }
}
