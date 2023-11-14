package com.codewithnabeel.classes

open class User(val name: String) {
  open var isLoggedIn: Boolean = false
  open fun login() {
    println("Inside Login")
  }
}

class Student(name: String) : User(name) {
  override var isLoggedIn: Boolean = false

  companion object {
    const val noOfEnrolledCourses = 5
    fun country() = "PAK"
  }

  override fun login() {
    super.login()
    println("Inside Student Login")
  }
}

class Instructor(name: String) : User(name) {
  override fun login() {
    super.login()
    println("Inside Instructor Login")
  }
}


fun main() {
  val student = Student("Nabeel")
  println("Student name: ${student.name}")
  student.login()
  student.isLoggedIn = true
  println("LoggedIn value is ${student.isLoggedIn}")

  val country = Student.country()
  println("Country is $country")

  println("noOfEnrolledCourses is : ${Student.noOfEnrolledCourses}")

  val instructor = Instructor("Arif")
  println("Instructor name: ${instructor.name}")
  instructor.login()
}