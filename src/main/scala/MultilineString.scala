object MultilineString {
  def main(args: Array[String]): Unit ={
    val text =
      """
        |This is a multiline string.
        |You don't need to use \n for new line.
        |
        |My name is Suryabhan Singh
        |""".stripMargin
        println(text)
  }

}
