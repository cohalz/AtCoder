object Main {
  def main(arg:Array[String]) = {
    val in = readLine.split(" ")
    val deg = in(0).toInt
    val dis = in(1).toInt / 60.0
    val arr = Array("N","NNE","NE","ENE","E","ESE","SE","SSE","S","SSW","SW","WSW","W","WNW","NW","NNW")
    if(dis < 0.25) print("C")
    else print(arr(((deg+112.5)/(3600/16)%16).toInt))
    print(" ")
    if(dis < 0.25) println("0")
    else if(dis < 1.55) println("1")
    else if(dis < 3.35) println("2")
    else if(dis < 5.45) println("3")
    else if(dis < 7.95) println("4")
    else if(dis < 10.75) println("5")
    else if(dis < 13.85) println("6")
    else if(dis < 17.15) println("7")
    else if(dis < 20.75) println("8")
    else if(dis < 24.45) println("9")
    else if(dis < 28.45) println("10")
    else if(dis < 32.65) println("11")
    else                 println("12")
   }
}
  // Main.main(null)
