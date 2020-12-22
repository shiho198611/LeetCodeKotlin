package easy

import easy.math.DayOfTheYear
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DayOfTheYearTest {

    lateinit var dayOfTheYear: DayOfTheYear

    @Before
    fun initTest() {
        dayOfTheYear = DayOfTheYear()
    }

    @Test
    fun dayOfTheYear_Test01() {

        val date = "2019-01-09"
        val verify = 9

        val result = dayOfTheYear.dayOfYear(date)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun dayOfTheYear_Test02() {

        val date = "2019-02-10"
        val verify = 41

        val result = dayOfTheYear.dayOfYear(date)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun dayOfTheYear_Test03() {

        val date = "2003-03-01"
        val verify = 60

        val result = dayOfTheYear.dayOfYear(date)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun dayOfTheYear_Test04() {

        val date = "2004-03-01"
        val verify = 61

        val result = dayOfTheYear.dayOfYear(date)

        Assert.assertEquals(result, verify)
    }

}