package DataStructures

import scala.util.Random

class Account(val n: String, var bal: Double) {
  val id: Int = Random.nextInt()

  // Getters & Setters
  def name: String = n
  def balance: Double = bal

  def deposit(value: Double): Unit = this.bal += value

  def withdrawal(value: Double): Unit = this.bal -= value

  def set_interest(): Unit = {
    if (balance > 0) deposit(balance * .05) else deposit(balance * .1)
  }
  // Getters & Setters

  def transfer(account: Account, balance: Double): Unit = {
    if (this.balance < balance) println("Error: Not enough balance!")
    else {
      account.deposit(balance)
      this.withdrawal(balance)
      println("Transferred " + balance + " to the account " + account.id)
    }
  }
}
