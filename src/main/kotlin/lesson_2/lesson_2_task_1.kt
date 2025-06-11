package ru.ievetrov.lesson_2
import kotlin.math.*

fun main() {
    val markFirstStudent: Byte = 3
    val markSecondStudent: Byte = 4
    val markThirdStudent: Byte = 3
    val markFourthStudent: Byte = 5
    val sumOfMarks = markFirstStudent + markSecondStudent + markThirdStudent + markFourthStudent
    val averageMark = (sumOfMarks / 4).toDouble()

    println("%,.2f".format(averageMark))
}