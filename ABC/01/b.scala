object Main {
    def main(arg:Array[String]) = {
      val m = readInt
      if(m < 100) println("00")
      else if(m < 1000) println("0"+ (m/100) )
      else if(m <= 5000) println(m/100)
      else if(m >= 6000 && m <= 30000) println((m/1000) + 50)
      else if(m >= 35000 && m <= 70000) println(((m/1000)-30)/5 + 80)
      else if(m > 70000) println(89)
    }
}
// Main.main(null)
