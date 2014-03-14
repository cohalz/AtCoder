object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ")
    var x = in(0).toInt -1
    var y = in(1).toInt -1
    var w = in(2)
    var c = Array.ofDim[Int](9,9)
    var count = 0
    for(i <- 0 until 9) {
      var tmp = readLine.split("").filterNot(_ =="").map(_.toInt)
      for(j <- 0 until 9) {
      c(i)(j) = tmp(j)
      }
    }
    print(c(y)(x))
    for(i <- 0 until 3){
      if(w contains "R"){
        if(x < 8){
          x += 1
        }else{
          w = w.filterNot(_ == 'R') + "L"
          x -= 1
        }
      }
      else if(w contains "L"){
        if(x > 0){
          x -= 1
        }else{
          w = w.filterNot(_ == 'L') + "R"
          x += 1
        }
      }
      if(w contains "U"){
        if(y > 0){
          y -= 1
        }else{
          w = w.filterNot(_ == 'U') + "D"
          y += 1
        }
      }
      else if(w contains "D"){
        if(y < 8){
          y += 1
        }else{
          w = w.filterNot(_ == 'D') + "U"
          y -= 1
        }
      }
      print(c(y)(x))     
    }
    println("")
  }
}
