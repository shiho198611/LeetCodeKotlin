package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MajorityElementTest {

    lateinit var majorityElement: MajorityElement

    @Before
    fun initTest() {
        majorityElement = MajorityElement()
    }

    @Test
    fun majorityElement_Test01() {
        val nums = intArrayOf(3,2,3)
        val verify = 3

        val result = majorityElement.majorityElement(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun majorityElement_Test02() {
        val nums = intArrayOf(2,2,1,1,1,2,2)
        val verify = 2

        val result = majorityElement.majorityElement(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun majorityElement_Test03() {
        val nums = intArrayOf(1)
        val verify = 1

        val result = majorityElement.majorityElement(nums)

        Assert.assertEquals(result, verify)
    }

}