package com.codewithnabeel.classes

// Data class provides toString, equals, hash by default
data class Course(
  val id: Int,
  val name: String,
  val author: String,
  var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT,
)

enum class CourseCategory {
  DEVELOPMENT,
  BUSINESS,
  DESIGN,
  MARKETING
}

fun main() {
  val course = Course(1, "Test Course", "NAB")
//  println(course)

  val course1 = Course(1, "Test Course", "NAB")

  println("Checking Object Equality ${course == course1}")

  val course2 = course1.copy(
    id = 2, author = "SAM"
  )

  println(course2)

  val course3 = Course(1, "Test Course", "NAB", CourseCategory.MARKETING)
  println(course3)

}