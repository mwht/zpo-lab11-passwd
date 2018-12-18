object Password {
  var predicates:List[String => Boolean] = List()

  def validate(password: String)(min_len: Int)(max_len: Int): Boolean = {
    if(password.length < min_len || password.length > max_len) false
    var result: Boolean = true
    predicates.foreach(p => result = result & p.apply(password))
    result
  }

  def addPredicate(predicate: String => Boolean): Unit = predicates = predicates :+ predicate

  def upperCase(strToValidate: String): Boolean = strToValidate.matches(".*[A-Z].*")

  def lowerCase(strToValidate: String): Boolean = strToValidate.matches(".*[a-z].*")

  def oneDigit(strToValidate: String): Boolean = strToValidate.matches(".*\\d.*")

  def twoDigits(strToValidate: String): Boolean = strToValidate.matches(".*\\d.*\\d.*")

}
