object Main {
  def main(args:Array[String]) = {
    val str1 = readLine
    val str2 = readLine
    val check = for(i <- 0 until str1.length) yield {     
      if(str1(i) == str2(i)) true
      else{
        if(str1(i) == '@'){
          str2(i) match {
            case 'a'|'t'|'c'|'o'|'d'|'e'|'r' => true
            case _ => false
          }
          
        } else if(str2(i) == '@'){
          str1(i) match {
            case 'a'|'t'|'c'|'o'|'d'|'e'|'r' => true
            case _ => false
          }
        }
        else false        
      }
    } 
    if(check.forall(_ == true)) println("You can win")
    else println("You will lose")
  }
}
