object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val a = Stream.fill(4,4)(sc.nextInt)
    val c = for {
      i <- 0 until 3
      j <- 0 until 3
      if a(i)(j) == a(i)(j+1) || a(i)(j) == a(i+1)(j)
    } yield (i,j)
    if(c.length == 0 && a(3)(3) != a(2)(3) && a(3)(3) != a(3)(2)) println("GAMEOVER")
    else println("CONTINUE")
  }
}
