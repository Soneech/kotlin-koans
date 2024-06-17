package org.soneech.classes.task5

fun Int.toRational(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.toRational(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    val number = 5
    val firstRational = number.toRational()
    println(firstRational)

    val pair = Pair(3, 8)
    val secondRational = pair.toRational()
    println(secondRational)
}