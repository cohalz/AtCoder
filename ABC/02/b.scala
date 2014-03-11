object Main {
  def main(arg:Array[String]) = {
    println(readLine.filterNot(x => x == 'a' || x == 'i' || x == 'u' || x == 'e' || x == 'o'))
    println(arg(0))
  }
}
