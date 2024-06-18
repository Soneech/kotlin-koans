package org.soneech.conventions.task3

import org.soneech.conventions.task1.MyDate

class MyDateRange(private val start: MyDate, private val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyDateIterator(start, end)
    }
}

class MyDateIterator(private val start: MyDate, private val end: MyDate): Iterator<MyDate> {
    private var current: MyDate = start

    override fun hasNext(): Boolean {
        return current <= end
    }

    override fun next(): MyDate {
        if (!hasNext())
            throw NoSuchElementException()

        val result = current
        current = current.followingDate()
        return result
    }
}

fun main() {
    val firstDate = MyDate(2019, 5, 10)
    val secondDate = MyDate(2019, 5, 15)

    for (date in firstDate..secondDate) {
        println(date)
    }
}