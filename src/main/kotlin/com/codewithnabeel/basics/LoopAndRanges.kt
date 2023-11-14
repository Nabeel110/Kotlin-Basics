package com.codewithnabeel.basics

fun main() {
  val range = 1..10
  for (i in range) {
    println("i : $i")
  }

  val revRange = 10 downTo 1
  for (i in revRange) {
    println("i : $i")
  }

  // skip
  for (i in revRange step 2) {
    println("Even numbers desc: $i")
  }

  exploreDoWhile()
  exploreWhile()

}


fun exploreDoWhile() {
  println("Explore Do while")
  var i = 0
  do {
    println("i in do while : $i")
    i++
  } while (i < 5)
}

fun exploreWhile() {
  println("Explore while")
  var x = 0
  while (x <= 5) {
    println("x in while : $x")
    x++
  }
}
