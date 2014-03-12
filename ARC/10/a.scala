object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    var n = in(0)
    val m = in(1)
    val a = in(2)
    val b = in(3)
    var nd = 0
    for(i <- 0 until m){
      if(nd == 0){
        var c = readInt
        if(n <= a)
          n += b
        if(n < c){
          nd = i+1
        }else{
          n -= c
        }
      }
    }
    if(nd == 0) println("complete")
    else println(nd)
  }
}
