package org.soneech.introduction.task2

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")

fun main() {
    println(joinOptions(listOf("a", "b", "c", "d", "e", "f")))
}