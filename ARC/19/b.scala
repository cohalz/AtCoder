object Main {
  def main(args:Array[String]) = {
    val in = readLine
    var count = 0d
    var tmp = ""
    for(i <- 0 to (in.length-1)/2){
      if(in.length%2 != 0 && i == (in.length-1)/2) count *= 2.0
      if(in.length == 1) count = 0
      else if(in(i) == in(in.length-1-i)) count += 25.0
      else count += 24.0
      if(in.length%2 == 0 && i == (in.length-1)/2) count *= 2.0
    }
    println(count.toString.takeWhile(_ != '.'))
  }
}
