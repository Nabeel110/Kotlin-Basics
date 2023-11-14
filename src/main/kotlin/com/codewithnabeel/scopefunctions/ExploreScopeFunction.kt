package com.codewithnabeel.scopefunctions

import com.codewithnabeel.classes.Course
import com.codewithnabeel.classes.CourseCategory


fun main() {
//  exploreApply()
//  exploreAlso()
//  exploreLet()
  exploreWith()
}

fun exploreWith() {
  val numbers = mutableListOf(1, 2, 3, 4, 5)
  with(numbers) {
    println("Size is ${numbers.size}")
    sum()
  }
}

fun exploreLet() {
  val numbers = mutableListOf(1, 2, 3, 4, 5)
  val result = numbers.map { it * 2 }
    .filter { it > 5 }
    .let {
      println(it)
      it.sum()
    }
  println(result)
}

fun exploreApply() {
  val course = Course(
    1,
    "Design Thinking",
    "NAB"
  ).apply {
    courseCategory = CourseCategory.DESIGN
  }

  println("Course is $course")
}

fun exploreAlso() {
  Course(
    1,
    "Design Thinking",
    "NAB"
  ).also {
    println("Course is $it")
  }


}
