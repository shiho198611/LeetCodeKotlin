package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class NumberStudentsDoingHomeworkGivenTimeTest {

    lateinit var givenTime: NumberStudentsDoingHomeworkGivenTime

    @Before
    fun initTest() {
        givenTime = NumberStudentsDoingHomeworkGivenTime()
    }

    @Test
    fun busyStudent_Test01() {
        val startTime = intArrayOf(1,2,3)
        val endTime = intArrayOf(3,2,7)
        val queryTime = 4

        val result = givenTime.busyStudent(startTime, endTime, queryTime)
        val verify = 1

        Assert.assertEquals(result, verify)
    }

    @Test
    fun busyStudent_Test02() {
        val startTime = intArrayOf(4)
        val endTime = intArrayOf(4)
        val queryTime = 4

        val result = givenTime.busyStudent(startTime, endTime, queryTime)
        val verify = 1

        Assert.assertEquals(result, verify)
    }

    @Test
    fun busyStudent_Test03() {
        val startTime = intArrayOf(4)
        val endTime = intArrayOf(4)
        val queryTime = 5

        val result = givenTime.busyStudent(startTime, endTime, queryTime)
        val verify = 0

        Assert.assertEquals(result, verify)
    }

    @Test
    fun busyStudent_Test04() {
        val startTime = intArrayOf(1,1,1,1)
        val endTime = intArrayOf(1,3,2,4)
        val queryTime = 7

        val result = givenTime.busyStudent(startTime, endTime, queryTime)
        val verify = 0

        Assert.assertEquals(result, verify)
    }

    @Test
    fun busyStudent_Test05() {
        val startTime = intArrayOf(9,8,7,6,5,4,3,2,1)
        val endTime = intArrayOf(10,10,10,10,10,10,10,10,10)
        val queryTime = 5

        val result = givenTime.busyStudent(startTime, endTime, queryTime)
        val verify = 5

        Assert.assertEquals(result, verify)
    }

}