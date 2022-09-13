package DataStructures

class Bank(name: String, location: String, list: Option[Array[Account]] = None) {
  var account_list: Array[Account] = Array[Account]()

  // Assign the list if exists
  if (list.isDefined) {
    account_list = list.get
  }

  def list_neg_balanced(): Array[Account] = {
    var new_list = Array[Account]()
    account_list.foreach(acc => {
      if (acc.balance < 0) new_list :+= acc
    })

    println(new_list.mkString("Negative Accounts [", ", ", "]"))
    account_list
  }

  def sum(): Double = {
    var sum: Double = 0

    account_list.foreach(acc => {
      sum += acc.balance
    })

    sum
  }

  def calc_final_balance(): Double = {
    var sum: Double = 0

    account_list.foreach(acc => {
      // Adding the interest
      acc.set_interest()

      // calculate the sum
      sum += acc.balance
    })

    sum
  }
}
