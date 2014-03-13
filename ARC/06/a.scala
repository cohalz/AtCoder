object Main {
  def main(args:Array[String]) = {
    val e = readLine.split(" ").map(_.toInt)
    val b = readInt
    val l = readLine.split(" ").map(_.toInt)
    var f = 0
    var count = 0
    for(i <- 0 until e.length){
      if(l.exists(e(i) == _)) count += 1
    }
    if(count == 5 && l.exists(_ == b)) f = 1
    if(count == 6) println(1)
    else if(count == 5) println(3-f)
    else if(count > 2) println(8-count)
    else println(0)
  }
}
