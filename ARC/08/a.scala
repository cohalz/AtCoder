object Main {
  def main(args:Array[String]) = {
    var n = readInt
    var yen = 0
    while(n > 0){
      if(n >= 10){
        n -= 10
        yen += 100
      }else if(n >= 7){
        n = 0
        yen += 100
      }else {
        n -= 1
        yen += 15
      }
    }
    println(yen)
  }
}
