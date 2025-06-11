package ru.ievetrov.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfDeparture: Int = 9
    val minutesOfDeparture: Int = 39
    val travelTimeInMinutes: Int = 457
    val hoursOnTheWay = travelTimeInMinutes / MINUTES_IN_HOUR
    val minutesOnTheWay = travelTimeInMinutes % MINUTES_IN_HOUR
    val hourOfArrival = hourOfDeparture + hoursOnTheWay + (minutesOfDeparture + minutesOnTheWay) / MINUTES_IN_HOUR
    val minutesOfArrival = (minutesOfDeparture + minutesOnTheWay) % MINUTES_IN_HOUR

    println("$hourOfArrival:$minutesOfArrival")
}