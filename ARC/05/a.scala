object Main {
  def main(args:Array[String]) = {
    val n = readInt
    var count = 0
    var str = readLine.split(" ")
    str(n-1) = str(n-1).filterNot(_ == '.')
    count = str.filter(_ == "TAKAHASHIKUN").length + str.filter(_ == "Takahashikun").length + str.filter(_ == "takahashikun").length
    println(count)
  }
}
