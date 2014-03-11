object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ")
    println(in(0).toLong max in(1).toLong)
  }
}
