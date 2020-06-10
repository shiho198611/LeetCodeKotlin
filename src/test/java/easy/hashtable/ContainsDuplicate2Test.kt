package easy.hashtable

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ContainsDuplicate2Test {

    lateinit var containsDuplicate: ContainsDuplicate2

    @Before
    fun initTest() {
        containsDuplicate = ContainsDuplicate2()
    }

    @Test
    fun containsNearbyDuplicate_Test01() {
        val nums = intArrayOf(1, 2, 3, 1)
        val k = 3

        val result = containsDuplicate.containsNearbyDuplicate(nums, k)

        Assert.assertTrue(result)
    }

    @Test
    fun containsNearbyDuplicate_Test02() {
        val nums = intArrayOf(1, 0, 1, 1)
        val k = 1

        val result = containsDuplicate.containsNearbyDuplicate(nums, k)

        Assert.assertTrue(result)
    }

    @Test
    fun containsNearbyDuplicate_Test03() {
        val nums = intArrayOf(1, 2, 3, 1, 2, 3)
        val k = 2

        val result = containsDuplicate.containsNearbyDuplicate(nums, k)

        Assert.assertFalse(result)
    }

}