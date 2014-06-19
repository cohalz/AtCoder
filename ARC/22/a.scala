object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val str = sc.nextLine
    var c = 0
    str collect {
      case 'i' | 'I' =>
        if(c == 0) c += 1
      case 'c' | 'C' =>
        if(c == 1) c += 1
      case 't' | 'T' =>
        if(c == 2) c += 1
      case _ => c += 0
    }
    println(if(c == 3) "YES" else "NO")
  }
}
