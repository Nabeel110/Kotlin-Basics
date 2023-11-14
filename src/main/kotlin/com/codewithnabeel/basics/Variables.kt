package com.codewithnabeel.basics

fun main() {
  val name: String = "Nabeel"
  println(name)

//  name = "Zehra"

  var age = 25
  age = 56

  val course = "Discrete Mathematics"

  println("course $course is of length ${course.length}" )

  // multilines

  // ABC DEF
  //  EFG HIJ
  //
  val multiline = """
    ABC DEF
    EFG HIJ
  """.trimIndent()

  println("ABC DEF\n" +
      "EFG HIJ")
  println(multiline)

}