package ru.ievetrov.lesson_2

import kotlin.math.*

fun main() {
    val sumOfDeposit = 70_000
    val interestRate = 16.7
    val years = 20
    val totalSum = sumOfDeposit * ((1 + (interestRate / 100))).pow(years.toDouble())

    println(round(totalSum * 1000) / 1000.0)
}