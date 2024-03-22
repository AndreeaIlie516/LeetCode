import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Solution {
    fun daysBetweenDates(date1: String, date2: String): Int {
        val startDate = LocalDate.parse(date1)
        val endDate = LocalDate.parse(date2)

        val result = Math.abs(ChronoUnit.DAYS.between(startDate, endDate))

        return Math.toIntExact(result)
    }
}