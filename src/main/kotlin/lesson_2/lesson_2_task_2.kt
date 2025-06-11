package ru.ievetrov.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryOfPermanentEmployee = 30_000
    val numberOfInterns = 30
    val salaryOfIntern = 20_000
    val permanentEmployeesSalaryFund = numberOfPermanentEmployees * salaryOfPermanentEmployee
    val internsSalaryFund = numberOfInterns * salaryOfIntern
    val generalSalaryFund = permanentEmployeesSalaryFund + internsSalaryFund
    val sumOfAverageSalary = generalSalaryFund / (numberOfPermanentEmployees + numberOfInterns)

    println(permanentEmployeesSalaryFund)
    println(generalSalaryFund)
    println(sumOfAverageSalary)
}