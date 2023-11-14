package com.codewithnabeel.basics

fun main() {
  // if else
  // when

  var name = "Nabeel"

  if (name.length == 4) {
    println("Name is of 4 characters")
  } else {
    println("Name is not of 4 characters")

  }

  name = "Nabeel"

  val result = if (name.length == 6) {
    println("Name is of 6 characters")

  } else {
    println("Name is not of 6 characters")

  }
  println("result is $result")


  // using when to check conditions

  // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

  var position = 2

  val pos = if (position == 1) {
    "GOLD"

  } else if (position == 2) {
    "SILVER"

  } else if (position == 3) {
    "BRONZE"
  } else {
    "NO MEDAL"
  }

  println("Position is $pos")

  position = 1
  val medal = when (position) {
    1 -> "GOLD"
    2 -> "SILVER"
    3 -> "BRONZE"
    else -> "NO MEDAL"
  }

  println("Position is $medal")


}