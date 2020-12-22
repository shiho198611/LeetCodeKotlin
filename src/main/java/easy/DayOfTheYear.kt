package easy

class DayOfTheYear {

    fun dayOfYear(date: String): Int {

        val months = intArrayOf(31, 28, 31, 30, 31 ,30, 31, 31, 30, 31, 30, 31)
        val dates = date.split("-").map { it.toInt() }

        if(dates[0] % 4 == 0 && dates[0] % 100 != 0 || dates[0] % 400 == 0) {
            months[1]++
        }

        var result = dates[2]
        for(index in 0 until (dates[1] - 1) ) {
            result += months[index]
        }

        return result
    }

}