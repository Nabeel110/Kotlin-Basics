package com.codewithnabeel.collections

fun main() {
  val namesListUsingSeq = listOf("Nab", "Zohaib", "Ashnah")
    .asSequence()
    .filter { it.length >= 4 }
    .map { it.uppercase() }
    .toList()

//  println(namesListUsingSeq)

  val range = 1 .. 1000_000_000

  range
    .asSequence()
    .map { it.toDouble() }
    .take(40)
    .forEach { println("Value is $it") }
}