package ru.ievetrov.lesson_2

fun main() {
    val cristalOre: Int = 7
    val metalOre: Int = 11
    val buff = 1.2

    val cristalOreBuff = cristalOre * buff
    val metalOreBuff = metalOre * buff

    println(cristalOreBuff.toInt())
    println(metalOreBuff.toInt())

}