object Password {

  def validate(password: String, predicates: (String => Boolean)*): Boolean = {
    var result: Boolean = true
    predicates.foreach(p => result = result & p.apply(password))
    result
  }

  def upperCaseSingleChar(strToValidate: String): Boolean = strToValidate.matches(".*[A-Z].*")

  def lowerCaseSingleChar(strToValidate: String): Boolean = strToValidate.matches(".*[a-z].*")

  def oneDigit(strToValidate: String): Boolean = strToValidate.matches(".*\\d.*")

  def twoDigits(strToValidate: String): Boolean = strToValidate.matches(".*\\d.*\\d.*")

  def minLen(min_len: Int)(strToValidate: String): Boolean = strToValidate.length >= min_len

  def maxLen(max_len: Int)(strToValidate: String): Boolean = strToValidate.length <= max_len

}
