object Main {
  def main(args:Array[String]) = {
    val n = readInt
    val str = readLine
    val m1 = str.filter{_ == '1'}.length
    val m2 = str.filter{_ == '2'}.length
    val m3 = str.filter{_ == '3'}.length
    val m4 = str.filter{_ == '4'}.length
    print(m1 max m2 max m3 max m4)
    print(" ")
    println(m1 min m2 min m3 min m4)
  }
}
