package org.soneech.conventions.task3

import org.soneech.conventions.task1.MyDate
import java.util.*

operator fun MyDate.rangeTo(other: MyDate) = MyDateRange(this, other)

fun MyDate.followingDate(): MyDate {
    val calendar = Calendar.getInstance()
    calendar.set(year, month, dayOfMonth)

    val millisecondsInDay = 24 * 60 * 60 * 1000L
    val timeInMillis = calendar.timeInMillis + millisecondsInDay

    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis

    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}

