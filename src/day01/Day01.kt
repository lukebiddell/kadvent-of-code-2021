package day01

import utils.readInput
import utils.toInt
import utils.toIntList

fun main() = readInput("day01/Day01").let { input ->
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int = countIncreases(input.toIntList())

fun countIncreases(numbers: List<Int>): Int =
    (1 until numbers.size).map { numbers[it] > numbers[it - 1] }.sumOf { it.toInt() }

fun part2(input: List<String>): Int = countIncreasesSlidingWindow(input.toIntList())

fun countIncreasesSlidingWindow(numbers: List<Int>): Int = countIncreases(slidingWindowSums(numbers))

fun slidingWindowSums(numbers: List<Int>): List<Int> =
    (1 until numbers.size - 1).map { numbers.slice((it - 1)..(it + 1)) }.map { it.sum() }
