object Main {
  def main(arg:Array[String]) = {
    var c = Array.ofDim[Any](4, 4)
    for(i <- 0 until 4){
      val x = readf("{0} {1} {2} {3}")
      for(j <- 0 until 4){
        c(3-i)(3-j) = x(j)
      }
    }
    for(i <- 0 until 4){
      for(j <- 0 until 4){
        print(c(i)(j)+" ")
      }
      println("")
    }
  }
}
// Main.main(null)
