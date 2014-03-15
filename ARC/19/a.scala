object Main {
  def main(args:Array[String]) = {
    val in = readLine
    val x = in collect {
      case 'O' => '0'
      case 'D' => '0'
      case 'I' => '1'
      case 'Z' => '2'
      case 'S' => '5'
      case 'B' => '8'
      case x => x
    }
    println(x)
  }
}
