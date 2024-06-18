package org.soneech.conventions.task5

class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTenTimes(invokable: Invokable) =
    invokable()()()()()()()()()() // :D

fun main() {
    val result = invokeTenTimes(Invokable())
    println(result.numberOfInvocations)
}