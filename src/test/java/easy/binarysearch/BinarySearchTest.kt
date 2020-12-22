package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BinarySearchTest {

    lateinit var binarySearch: BinarySearch

    @Before
    fun initTest() {
        binarySearch = BinarySearch()
    }

    @Test
    fun search_Test01() {
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 9

        val verify = 4

        val result = binarySearch.search(nums, target)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun search_Test02() {
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 2

        val verify = -1

        val result = binarySearch.search(nums, target)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun search_Test03() {
        val nums = intArrayOf(5)
        val target = 5

        val verify = 0

        val result = binarySearch.search(nums, target)

        Assert.assertEquals(result, verify)
    }

}