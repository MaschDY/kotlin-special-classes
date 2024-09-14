package br.com.maschdy.kotlinspecialclasses

import br.com.maschdy.kotlinspecialclasses.models.DayOfWeek
import br.com.maschdy.kotlinspecialclasses.utils.UtilityHelper
import br.com.maschdy.kotlinspecialclasses.utils.toLetterList

fun main() {
//    Atividade 1
    val word = "Kombi"

    val letters = word.toLetterList()
    println(letters)

//    Atividade 2
    for (day in DayOfWeek.values()) {
        println("${day.name}: ${day.dayName}")
    }

//    Atividade 3 e 4
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println("É fim de semana? ${UtilityHelper.isWeekend()}")

    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    println("É fim de semana? ${UtilityHelper.isWeekend()}")
}
