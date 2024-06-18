package org.soneech.conventions.task4

import java.util.*

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): MyDate {
    val calendar = Calendar.getInstance()
    calendar.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)

    var timeInMillis = calendar.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L

    timeInMillis += amount * when (timeInterval) {
        TimeInterval.DAY -> millisecondsInADay
        TimeInterval.WEEK -> 7 * millisecondsInADay
        TimeInterval.YEAR -> 0L
    }

    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis

    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar. DATE))
}