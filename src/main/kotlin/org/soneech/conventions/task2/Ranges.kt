package org.soneech.conventions.task2

import org.soneech.conventions.task1.MyDate

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

fun main() {
    val beforeRangeDate = MyDate(2020, 5, 5)
    val inRangeDate = MyDate(2023, 1, 1)
    val afterRangeDate = MyDate(2024, 12, 5)

    val startDate = MyDate(2022, 3, 1)
    val endDate = MyDate(2024, 6, 17)

    println(checkInRange(beforeRangeDate, startDate, endDate))
    println(checkInRange(inRangeDate, startDate, endDate))
    println(checkInRange(afterRangeDate, startDate, endDate))
}