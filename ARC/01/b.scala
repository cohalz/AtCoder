object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    var a = in(0)
    val b = in(1)
    var count = 0
    var dif = 0
    var pn = 0
    while(a != b){
      dif = b-a
      pn = dif/dif.abs
      if(dif.abs >= 8) a += 10*pn
      else if(dif.abs >= 3) a += 5*pn
      else a += pn
      count += 1
    }
    println(count)
  }
}
