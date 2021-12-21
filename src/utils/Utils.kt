package utils

import java.io.File

fun readInput(name: String) = File("src", "$name.txt").readLines()

fun Boolean.toInt() = if (this) 1 else 0

fun List<String>.toIntList() = this.map { it.toInt() }
