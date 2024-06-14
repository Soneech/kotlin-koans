package org.soneech.introduction.task8

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { num -> num % 2 == 0 }

fun main() {
    val numbers = mutableListOf(1,2,3,4,5)
    println(numbers)
    println(containsEven(numbers))

    numbers.removeAt(1)
    numbers.removeAt(2)
    println(numbers)
    println(containsEven(numbers))
}