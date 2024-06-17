package org.soneech.classes.task2


fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

class Diff(val left: Expr, val right: Expr) : Expr

fun main() {
    val num = Num(1)
    println(eval(num))

    val sum = Sum(Num(2), Num(3))
    println(eval(sum))

    val diff = Diff(Num(5), Num(4))
    println(eval(diff))
}