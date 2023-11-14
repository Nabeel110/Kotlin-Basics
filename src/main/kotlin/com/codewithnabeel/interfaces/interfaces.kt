package com.codewithnabeel.interfaces

import com.codewithnabeel.classes.Course

interface Repository {
  fun getAll(): Any
}

interface CourseRepository {
  val isCoursePersisted: Boolean
  fun getById(id: Int): Course

  fun save(course: Course): Int {
    println("Course : $course")
    return course.id
  }
}

// class can extends multiple interfaces but can inherit only 1
class SqlCourseRepository : CourseRepository, Repository {
  override var isCoursePersisted: Boolean = false

  override fun getById(id: Int): Course {
    return Course(id, "Test Book", "Nab")
  }

  override fun save(course: Course): Int {
    isCoursePersisted = true
    return super.save(course)
  }

  override fun getAll(): Any {
    return 1
  }
}

class NoSqlCourseRepository : CourseRepository {
  override val isCoursePersisted: Boolean = false

  override fun getById(id: Int): Course {
    return Course(id, "Test Book", "Nab")
  }

  override fun save(course: Course): Int {
    println("Course in NosqlCourseRepository : $course")
    return course.id

  }

}

fun main() {
  val sqlCourseRepository = SqlCourseRepository()
  val course = sqlCourseRepository.getById(1)
  println("Course is $course")

  val _sqlCourseId = sqlCourseRepository.save(Course(10, "test 2", "Absar"))
  println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")

  val noSqlCourseRepository = NoSqlCourseRepository()
  val course2 = noSqlCourseRepository.getById(2)
  println("No SQL Course is $course2")

  val courseId = noSqlCourseRepository.save(Course(10, "test 2", "Absar"))
  println("Saved course id is $courseId")


}