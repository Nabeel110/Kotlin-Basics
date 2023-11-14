package com.codewithnabeel.exceptions

import java.lang.RuntimeException

fun returnNothing() : Nothing {
  throw  RuntimeException("Exception")
}

fun main() {
  println("Name length is ${nameLength("Nabeel")}")
  println("Name length is ${nameLength(null)}")
  returnNothing()
}

fun nameLength(name: String?): Int? {
  val result = try {
    name!!.length
  } catch (e: Exception) {
    println("Exception is $e")
    null
  }

  return result
}
