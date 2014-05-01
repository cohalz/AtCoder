object Main {
  def main(args:Array[String]) = {
    val in = readInt
    var dp = new Array[Int](in+2)
    dp(0) = 0
    dp(1) = 0
    dp(2) = 1
    for(i <- 0 until in-3){
      dp(i+3) = dp(i+2)%10007 + dp(i+1)%10007 + dp(i)%10007
    }
    println(dp(in-1)%10007)
  }
}
