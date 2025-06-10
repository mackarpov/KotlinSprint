package ru.ievetrov.lesson_1

fun main() {
    val secondsInMinute: Byte = 60
    val minutesInHour: Byte = 60
    val timeInSeconds = 6_480
    val timeInMinutes = timeInSeconds / secondsInMinute
    val timeInHours = timeInMinutes / minutesInHour
    val remainingTimeInSeconds = timeInSeconds % secondsInMinute
    val remainingTimeInMinutes = timeInMinutes % minutesInHour

    println("%02d:%02d:%02d".format(timeInHours, remainingTimeInMinutes, remainingTimeInSeconds))
}