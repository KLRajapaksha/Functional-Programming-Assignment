

object obj1 extends App {

  def matchTest(x: Double, n: Int): Double = n match {
    case 0 => 1
    case 1 => x
    case _ =>     if (n % 2 == 0) {
      val temp = matchTest(x, n / 2)
      temp * temp
    }
    else if(n < 0){
      1/matchTest(x,math.abs(n))

    }
    else {
      x * matchTest(x, n - 1)
    }
  }
  println(matchTest(2,-2))
}
