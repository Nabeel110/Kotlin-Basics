package com.codewithnabeel.collections

import com.codewithnabeel.dataset.Course
import com.codewithnabeel.dataset.CourseCategory
import com.codewithnabeel.dataset.KAFKA
import com.codewithnabeel.dataset.courseList

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
  courseList.filter { predicate.invoke(it) }
    .forEach {
      println("Development courses are $it")
    }

}

fun main() {
  val courseList = courseList()

  val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
  val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

  val nestedList = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

  val mapResult = nestedList.map { outerList ->
    outerList.map {
      it.toDouble()
    }
  }

  println("Nested Map result : $mapResult")

  val flatMapResult = nestedList.flatMap { outerList ->
    outerList.map {
      it.toDouble()
    }
  }

  println("Nested FlatMap result : $flatMapResult")

  val kafkaCourses = exploreFlatMap(courseList, KAFKA)
//  println(kafkaCourses)

//  exploreFilter(courseList, designPredicate)
//  exploreFilter(courseList, devPredicate)

//  exploreMap(courseList, designPredicate)
//  exploreMap(courseList, devPredicate)

//  exploreHashMap()
  collectionsNullability()
}

fun collectionsNullability() {
  var list: MutableList<String>?
  list = mutableListOf()
  list.add("Nabeel")
  list.forEach {
    println("Value is $it")
  }

  val list1: List<String?> = listOf("Adnan", null, "Harry")
  list1.forEach { element ->
    val length = element?.length ?: 0
    println("Value length is $length")


  }
}

fun exploreHashMap() {
  val nameAgeMutableMap = mutableMapOf("Nabeel" to 25, "Afzal" to 20)

  nameAgeMutableMap.forEach { k, v ->
    println("Key is $k and value is $v")
  }
}

fun exploreFlatMap(courseList: MutableList<Course>, filterValue: String): List<String> {
  val kafkaCourses = courseList.flatMap { course ->
    val courseName = course.name
    course.topicsCovered
      .filter { it == filterValue }
      .map { courseName }
  }
  return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
  courseList
    .filter(predicate)
    .map { "${it.name} - ${it.category}" }
    .forEach { println(it) }
}

