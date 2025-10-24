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

    val text1 =
      """
           this is a multiline string.
           It keeps space and indentation as it is.
           No stripMargin used. """
           println(text1)
    val cmc =
      """
        #Hello
        #This is scala
        #Using custom margin character""".stripMargin('#')
        println(cmc)
  }

}
