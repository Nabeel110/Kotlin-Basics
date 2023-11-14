package com.codewithnabeel.collections

fun main() {
  val names = listOf("Nabeel", "Zohaib", "Adam")
  println("Names : $names")

  val namesMutableList = mutableListOf("Nabeel", "Zohaib", "Adam")
  println("Mutable Names : $namesMutableList")
  namesMutableList.add("Haris")
  println("Mutable Names After : $namesMutableList")


  val nameSet = setOf("NAB", "Harry", "Fasih")
  println("Name set: $nameSet")

  val mutableSet = mutableSetOf("NAB", "NAB","Harry", "Fasih")
  mutableSet.add("Adnan")
  println("Name set: $mutableSet")

  val ageMap = mapOf("Nabeel" to 25, "Adnan" to 24)
  println("Age Map: $ageMap")

}