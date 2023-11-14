package com.codewithnabeel.classes

class Item() {
  var name: String = ""
  var price: Double = 0.0
    get() {
      println("Inside Getter")
      return field
    }   // Using getters and setter (they need to be directly below fields)
    set(value) {
      if (value >= 0.0) {
        println("Inside Setter")
        field = value
      } else {
        throw IllegalAccessException("Negative Price is not allowed")
      }
    }

  constructor(_name: String) : this() {
    name = _name
  } // Secondary constructor
}

fun main() {
  val item = Item("iphone")
  println("Item name is ${item.name}")
  item.name = "Iphone 13 Pro"
  println("Item name is ${item.name}")

  item.price = 10.0
  println(item.price)
}