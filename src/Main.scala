object Main {
  def main(args: Array[String]): Unit = {

    var testPasswd = "zaq1W2sx"

    println(Password.validate(
      testPasswd,
      Password.minLen(3),
      Password.maxLen(10),
      Password.lowerCaseSingleChar,
      Password.upperCaseSingleChar,
      Password.oneDigit,
      Password.twoDigits
    ))
  }
}
