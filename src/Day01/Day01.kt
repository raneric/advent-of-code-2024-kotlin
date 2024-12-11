package Day01

import Utils.println
import Utils.readInput
import kotlin.math.abs

fun main() {

    val testInput = readInput("Day01/Day01_test")
    val input = readInput("Day01/Day01")

    val left = input.getLeft()
    val right = input.getRight()

    fun part1(): Int {
        val sortedLeft = left.sorted()
        val sortedRight = right.sorted()
        var sum = 0
        sortedLeft.forEachIndexed{ index, value->
            sum += abs(value - sortedRight[index])
        }
        return sum
    }

    fun part2(): Int {
        return left.fold(0) { acc, i ->
            acc + ( i * right.count { it == i })
        }
    }

    // Or read a large test input from the `src/Day01_test.txt` file:

    part1().println()
    part2().println()
}

private fun List<String>.getLeft(): List<Int> {
    return this.map {
        it.split(" ")[0].toInt()
    }
}

private fun List<String>.getRight(): List<Int> {
    return this.map {
        it.split(" ").filter { value -> value != "" }[1].toInt()
    }
}