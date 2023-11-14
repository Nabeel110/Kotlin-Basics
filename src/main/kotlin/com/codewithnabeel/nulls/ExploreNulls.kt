package com.codewithnabeel.nulls

data class Movie(
  val id: Int?,
  val name: String,
)

fun printName(name: String) {
  println("Name is : $name")

}

fun printName2(name: String?) {
  println("Name is : $name")

}
fun main() {
  var nameNullable: String? = null

//  printName(nameNullable!!)
  nameNullable?.run {
    println(this)
  }


  println("Value is : $nameNullable")

  // Using safe(?) operator and elvis (?:) operator
  val length = nameNullable?.length ?: 0
  println("Value length is : $length")

  nameNullable = "NABEEL"
  println("Value is : $nameNullable")

  println("Value length is : ${nameNullable.length}")


  var name: String = "Ahmed"

  val movie = Movie(null, "Flash")
  val savedMovie = saveMovie(movie)
  println("Save movie is : $savedMovie")

}

fun saveMovie(movie: Movie): Movie {
  println("Move is Saved")
  return movie.copy(id = 1)
}