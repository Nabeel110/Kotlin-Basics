package com.codewithnabeel.classes

class Person(val name: String = "", val age: Int = 0) // Primary constructor
{
  var email: String = ""
  var nameLength: Int = 0

  // Init block always run when object is initialized
  init {
    println("Inside Init Block")
    nameLength = name.length
  }

  constructor(_email: String, _name: String = "", _age: Int = 0) : this(_name, _age) {
    email = _email
  }

  fun action() {
    println("Person walks")
  }
}

fun main() {
  val person = Person("Nabeel", 25) // No use of new keyword in Kotlin
  person.action()
  println("Name is ${person.name} and age is ${person.age}")

  val person1 = Person() // Using default values in constructor
  println("Name is ${person1.name} and age is ${person1.age}")

  val person2 = Person(_email = "nab@gmail.com", "Nabeel", 25) // Using secondary constructor
  println("Name is ${person2.name} and age is ${person2.age} and email is ${person2.email}  and name length is ${person2.nameLength}")
}