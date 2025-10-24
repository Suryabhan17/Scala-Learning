object StringEquality {
  def main(args: Array[String]): Unit={
    val a="Scala"
    val b="Scala"
    val g="scala"
    val c= new String("Scala")
    println(a.equals(b))
    println(a.equals(c))
    println(g.equalsIgnoreCase(a))
    // eq only check the reference
    println(a eq b)
    println(a eq c)
    // hello
     println(a==b)
    println(a==c)

  }

}
