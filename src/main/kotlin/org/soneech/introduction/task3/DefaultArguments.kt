package org.soneech.introduction.task3

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(  // возвращает список строк - результаты выполнения функции foo
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

fun main() {
    useFoo().forEach { println(it) }
}