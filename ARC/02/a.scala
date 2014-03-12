object Main {
  def main(args:Array[String]) = {
    val y = readInt
    if(y%400 == 0) println("YES")
    else if(y%100 == 0) println("NO")
    else if(y%4 == 0) println("YES")
    else println("NO")
  }
}
