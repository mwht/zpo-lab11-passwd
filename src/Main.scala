object Main {
  def main(args: Array[String]): Unit = {
    Password.addPredicate(Password.upperCase)
    Password.addPredicate(Password.lowerCase)
    Password.addPredicate(Password.oneDigit)
    Password.addPredicate(Password.twoDigits)


    var testPasswd = "zaq1W2sx"

    println(Password.validate(testPasswd)(3)(10))
  }
}
