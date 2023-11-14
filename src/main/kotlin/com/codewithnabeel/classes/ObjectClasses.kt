package com.codewithnabeel.classes

// object class is equivalent to Singleton pattern
object Authenticate {
  fun authenticate(userName: String, password: String) {
    println("User Authenticated for username : $userName")
  }
}

fun main() {
  Authenticate.authenticate("nab","124")
}