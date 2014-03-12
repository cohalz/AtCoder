object Main {
  def main(args:Array[String]) = {
    val key = readLine
    println(readLine.filterNot(_ == key))
  }
}
