object Main {
  def main(args:Array[String]) = {
    val key = readChar
    val str = readLine
    println(str.filterNot(_ == key))
  }
}
