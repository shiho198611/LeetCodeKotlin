package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FindPivotIndexTest {

    lateinit var findPivotIndex: FindPivotIndex

    @Before
    fun initTest() {
        findPivotIndex = FindPivotIndex()
    }

    @Test
    fun findPivotIndex_Test01() {
        val nums = intArrayOf(1, 7, 3, 6, 5, 6)
        val verify = 3

        val result = findPivotIndex.pivotIndex(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun findPivotIndex_Test02() {
        val nums = intArrayOf(1, 2, 3)
        val verify = -1

        val result = findPivotIndex.pivotIndex(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun findPivotIndex_Test03() {
        val nums = intArrayOf()
        val verify = -1

        val result = findPivotIndex.pivotIndex(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun findPivotIndex_Test04() {
        val nums = intArrayOf(-1,-1,-1,-1,-1,0)
        val verify = 2

        val result = findPivotIndex.pivotIndex(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun findPivotIndex_Test05() {
        val nums = intArrayOf(-1,-1,0,0,-1,-1)
        val verify = 2

        val result = findPivotIndex.pivotIndex(nums)

        Assert.assertEquals(result, verify)
    }
}