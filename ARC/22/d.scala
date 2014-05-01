object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toLong)
    var count = 0
    for(i <- in(0) to in(1)){
      var s = i.toString
      if((s contains '4' )|| (s contains '9')) count += 1
    }
    println(count)
  }
}
