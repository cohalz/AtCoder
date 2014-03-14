object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    val n = in(0)
    val l = in(1)
    val str = new Array[String](l)
    for(i <- 0 until l) {
      str(i) = readLine
    }
    val o = readLine
    var d = o.indexOf('o')
    for(i <- l-1 to 0 by -1){
      if(d/2+1 < n && str(i)(d+1) == '-')  d += 2
      else if(d > 0 && str(i)(d-1) == '-') d -= 2
    }
    println(d/2+1)
  }
}
