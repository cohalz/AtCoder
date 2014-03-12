object Main {
  def main(args:Array[String]) = {
    val n = readInt
    var dic = new Array[String](n)
    for(i <- 0 until n){
      dic(i) = readLine
    }
    dic.map(_.reverse).sorted.map(_.reverse).foreach(println)
  }
}
