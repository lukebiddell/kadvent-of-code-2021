package day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import utils.readInput

internal class Day01KtTest {
    @Test
    fun part1() {
        val expected = 6
        assertEquals(expected, part1(readInput("day01/Day01_part1_test")))
    }

    @Test
    fun `count increases`() {
        assertEquals(0, countIncreases(listOf()))
        assertEquals(0, countIncreases(listOf(1)))
        assertEquals(1, countIncreases(listOf(1, 2)))
    }

    @Test
    fun part2() {
        val expected = 5
        assertEquals(expected, part2(readInput("day01/Day01_part2_test")))
    }

    @Test
    fun `sliding window`() {
        assertEquals(0, countIncreasesSlidingWindow(listOf()))
        assertEquals(0, countIncreasesSlidingWindow(listOf(5)))
        assertEquals(0, countIncreasesSlidingWindow(listOf(5, 10)))
        assertEquals(0, countIncreasesSlidingWindow(listOf(5, 10, 15)))
        assertEquals(1, countIncreasesSlidingWindow(listOf(5, 10, 15, 20)))
        assertEquals(2, countIncreasesSlidingWindow(listOf(5, 10, 15, 20, 25)))
    }
}
