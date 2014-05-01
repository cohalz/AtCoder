object Main {
  def main(args:Array[String]) = {
    val t = readInt
    val n = readInt
    val a = readLine.split(" ").map(_.toInt).sorted
    val m = readInt
    var b = readLine.split(" ").map(_.toInt).sorted.toArrayBuffer
    var str = "yes"
    if(m > n) str = "no"
    else {
      for(i <- 0 until m; j <- 0 until m) {
        var ind = b.indexWhere(_-a(i) < t)
        if(ind == -1) str = "no"
        else b.remove(b.indexWhere(_-a(i) < t))
      }
    }
    println(str)
  }
}
