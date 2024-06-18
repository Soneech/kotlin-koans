package org.soneech.conventions.task4


data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

class RepeatedTimeInterval(val timeInterval: TimeInterval, val amount: Int)


operator fun TimeInterval.times(amount: Int) =
    RepeatedTimeInterval(this, amount)

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.amount)


fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}

fun main() {
    val testDate = MyDate(2016, 6, 10)
    println(task1(testDate))
    println(task2(testDate))
}