package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ContainsDuplicateTest {

    lateinit var containsDuplicate: ContainsDuplicate

    @Before
    fun initTest() {
        containsDuplicate = ContainsDuplicate()
    }

    @Test
    fun containsDuplicate_Test01() {
        val nums = intArrayOf(1,2,3,1)

        val result = containsDuplicate.containsDuplicate(nums)

        Assert.assertTrue(result)
    }

    @Test
    fun containsDuplicate_Test02() {
        val nums = intArrayOf(1,2,3,4)

        val result = containsDuplicate.containsDuplicate(nums)

        Assert.assertFalse(result)
    }

    @Test
    fun containsDuplicate_Test03() {
        val nums = intArrayOf(1,1,1,3,3,4,3,2,4,2)

        val result = containsDuplicate.containsDuplicate(nums)

        Assert.assertTrue(result)
    }

    @Test
    fun containsDuplicate_Test04() {
        val nums = intArrayOf()

        val result = containsDuplicate.containsDuplicate(nums)

        Assert.assertFalse(result)
    }

}