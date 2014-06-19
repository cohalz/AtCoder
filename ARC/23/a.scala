object Main {
  def main(args:Array[String]) = {
    val y = readInt
    val m = readInt
    val d = readInt
    println(dd(2014,5,17)-dd(y,m,d))
  }
  def dd(y:Int,m:Int,d:Int): Int  = {
    var a = 0
    var b = 0
    if(m <= 2) {
      a = 12
      b = 1
    }
    365 * (y-b) + ((y-b)/4) - ((y-b)/100) + ((y-b)/400) + (306*(m+a+1))/10 + d -429
  }
}

