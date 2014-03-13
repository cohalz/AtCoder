object Main {
  def main(args:Array[String]) = {
    val n = readInt
    val f = (2 to Math.sqrt(n).toInt).exists(n%_ == 0)
    if(f) println("NO")
    else println("YES")
  }
}
