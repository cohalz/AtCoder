object Main {
  def main(arg:Array[String]) = {
    val in = readLine.split(" ")
    println(in(0).toLong max in(1).toLong)
  }
}
// Main.main(null)
