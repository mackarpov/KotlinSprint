package ru.ievetrov.lesson_1

fun main() {
    val timeInSeconds = 6_480
    val timeInMinutes = timeInSeconds / 60
    val timeInHours = timeInMinutes / 60
    val remainingTimeInSeconds = timeInSeconds % 60
    val remainingTimeInMinutes = timeInMinutes % 60

    println("%02d:%02d:%02d".format(timeInHours, remainingTimeInMinutes, remainingTimeInSeconds))
}