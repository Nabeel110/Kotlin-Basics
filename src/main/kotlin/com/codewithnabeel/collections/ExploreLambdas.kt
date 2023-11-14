package com.codewithnabeel.collections

/**
 * Higher Order Functions
 */
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
  return op(x, y)
}

fun main() {

  val addLambda = { x: Int -> x + x }

  val addResult = addLambda(2)
  println("Add result: $addResult")

  val multiplyLambda = { x: Int, y: Int ->
    println("X is $x and y is $y")
    x * y
  }

  val multiplyResult = multiplyLambda(2, 3)
  println("MultiplyResult : $multiplyResult")

  val result = calculate(2, 5, { a, b -> a * b })
  println("Result is: $result")
}