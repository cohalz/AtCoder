object Main {
  def main(args:Array[String]) = {
    val n = readInt
    val arr = new Array[Int](n)
    for(i <- 0 until n){
      arr(i) = readInt
    }
    println(arr.min)
  }
}
