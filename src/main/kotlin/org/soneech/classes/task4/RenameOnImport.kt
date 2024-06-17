package org.soneech.classes.task4

import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " + KRandom.nextInt(10) +
            "; Java random: " + JRandom().nextInt(10) + "."
}

fun main() {
    println(useDifferentRandomClasses())
}

