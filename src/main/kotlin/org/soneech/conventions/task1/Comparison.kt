package org.soneech.conventions.task1

data class MyDate(var year: Int, var month: Int, var dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}

fun main() {
    val date1 = MyDate(2024, 3, 20)
    val date2 = MyDate(2023, 5, 11)
    val date3 = MyDate(2024, 7, 15)

    println(date1 < date2)
    println(date2 > date3)
    println(date3 > date1)
}