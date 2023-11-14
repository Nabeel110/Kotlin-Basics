package com.codewithnabeel.functions

// Top Level Variable (Can be used from other classes as well)
const val course = "Kotlin With SpringBoot"

// Top level function
fun topLevelFunction(): Int {
  return (0..100).random()
}

fun main() {
  println("Num is ${topLevelFunction()}")
}