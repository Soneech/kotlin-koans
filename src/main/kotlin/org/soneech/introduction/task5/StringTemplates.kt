package org.soneech.introduction.task5

const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""

fun main() {
    val regex = Regex(getPattern())
    val dates = listOf("13 JUN 1992", "18 FEB 2005", "133 11 1992")

    println("pattern: ${getPattern()}")
    dates.forEach { println("result for $it: ${ if (regex.matches(it)) "matches" else "doesn't match" }") }
}