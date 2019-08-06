package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MissingNumberTest {

    lateinit var missingNumber: MissingNumber

    @Before
    fun initTest() {
        missingNumber = MissingNumber()
    }

    @Test
    fun missingNumber_Test01() {
        val nums = intArrayOf(3,0,1)
        val missing = missingNumber.missingNumber(nums)

        Assert.assertEquals(missing, 2)
    }

    @Test
    fun missingNumber_Test02() {
        val nums = intArrayOf(9,6,4,2,3,5,7,0,1)
        val missing = missingNumber.missingNumber(nums)

        Assert.assertEquals(missing, 8)
    }

    @Test
    fun missingNumber_Test03() {
        val nums = intArrayOf(0)
        val missing = missingNumber.missingNumber(nums)

        Assert.assertEquals(missing, 1)
    }

    @Test
    fun missingNumber_Test04() {
        val nums = intArrayOf(1,2)
        val missing = missingNumber.missingNumber(nums)

        Assert.assertEquals(missing, 0)
    }

}