package com.codewithnabeel.cast

import com.codewithnabeel.classes.Course

fun main() {
  val course = Course(1, "Book Name", "Author")

  checkType(course)
  checkType("Nabeel")
}

fun checkType(type: Any) {
  when (type) {
    is Course -> println(type)
    is String -> println(type.lowercase())
  }
}
