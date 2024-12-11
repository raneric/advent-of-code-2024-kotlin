package Day01

import Utils.println
import Utils.readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01/Day01_test")

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01/Day01")
    part1(input).println()
    part2(input).println()
}