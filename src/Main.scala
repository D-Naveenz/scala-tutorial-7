import DataStructures.{Account, Bank, RationalNumber}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hi!")

    // Section 1
    val r1 = new RationalNumber(5, 7)
    println("Number: " + r1)
    println("Negative: " + r1.neg())
    println("Subtraction: " + r1.sub(new RationalNumber(4, 5)))
    // Section 1

    println()

    // Section 2
    val accounts: Array[Account] = Array(
      new Account("Madhawa", 10000),
      new Account("Sumathipala", -20000),
      new Account("Pamith", -8000),
      new Account("Thewindu", 0),
    )
    val bank = new Bank("Commercial", "Dambulla", Some(accounts))
    bank.list_neg_balanced()
    println("Sum of all: " + bank.sum())
    println("Final Balance: " + bank.calc_final_balance())
    // Section 2
  }
}

