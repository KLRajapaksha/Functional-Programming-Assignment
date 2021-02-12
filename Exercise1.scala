

object exercise1 {
  def main(args: Array[String]): Unit={
    class BankAccount {
      val balance = Var(0)

      def deposit(x: Int): Unit = {
        val curBalance = balance()
        balance() = curBalance + x
      }
      def withdraw(x: Int): Unit = {
        val curBalance = balance()
        balance() = curBalance - x
      }
    }

  }

}
