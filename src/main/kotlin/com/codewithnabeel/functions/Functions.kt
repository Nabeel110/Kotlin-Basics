package com.codewithnabeel.functions

import java.time.LocalDate

// Void = Unit (No return value)
fun printName(name: String) {
  println("Name is $name")
}

// Function with Multiple Parameters
fun addition(i: Int, j: Int): Int {
  return i + j
}

// Function as expression
fun advanceAddition(i: Int, j: Int) = i + j

// Function With Default and Named Arguments
fun printPersonalDetails(
  name: String,
  email: String = "",
  dob: LocalDate = LocalDate.now(),
) {
  println("Name is: $name\nEmail is: $email\nDob is: $dob")
}

fun main() {
  printName("Nabeel")

  val result = addition(1, 2)
  println("Addition result is $result")
  val additionAdvanceFunction = advanceAddition(1, 2)
  println("Advance function addition result is $additionAdvanceFunction")

  printPersonalDetails("Nabeel", "nab@gmail.com") // Using default value of DOB
  printPersonalDetails("Nabeel", "nab@gmail.com", LocalDate.parse("1999-04-08"))
  printPersonalDetails(name = "Nabeel", dob = LocalDate.parse("1999-04-08")) // Using named parameters
}





