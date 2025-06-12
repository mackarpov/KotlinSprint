package ru.ievetrov.lesson_2

fun main() {
    val cristalOre: Int = 7
    val metalOre: Int = 11
    val buff = 20.0

    val cristalOreBuff = cristalOre * (buff / 100 + 1)
    val metalOreBuff = metalOre * (buff / 100 + 1)

    println(cristalOreBuff.toInt())
    println(metalOreBuff.toInt())

}