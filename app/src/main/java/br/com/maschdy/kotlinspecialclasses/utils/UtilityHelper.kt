package br.com.maschdy.kotlinspecialclasses.utils

import br.com.maschdy.kotlinspecialclasses.models.DayOfWeek

object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek) {
        currentDay = day
    }

    fun isWeekend(): Boolean {
        return currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY
    }
}
