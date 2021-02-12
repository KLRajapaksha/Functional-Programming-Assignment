import scala.io.StdIn.readLine
import scala.math.pow
object CW8c {
 def main(args: Array[String]): Unit={

   def round(x: Double, n: Int):Double = {

     val mult: Double = x * pow(10,n)
     val add: Double = mult + 0.5
     val reuslts: Int = add.toInt

     val result: Double = reuslts / pow(10,n)

     result // 2.13
   }

   var num:Double = readLine("what is the value to be round off >").toDouble
   var decimal_count:Int = readLine("what is the number of digits after the decimal point for rounding off >").toInt
   println(round(num,decimal_count))

 }

}
