package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SearchInsertPositionTest {

    lateinit var searchInsertPosition: SearchInsertPosition

    @Before
    fun initTest() {
        searchInsertPosition = SearchInsertPosition()
    }

    @Test
    fun searchInsert_Test01() {
        val input = intArrayOf(1,3,5,6)
        val target = 5
        val verify = 2

        val result = searchInsertPosition.searchInsert(input, target)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun searchInsert_Test02() {
        val input = intArrayOf(1,3,5,6)
        val target = 2
        val verify = 1

        val result = searchInsertPosition.searchInsert(input, target)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun searchInsert_Test03() {
        val input = intArrayOf(1,3,5,6)
        val target = 7
        val verify = 4

        val result = searchInsertPosition.searchInsert(input, target)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun searchInsert_Test04() {
        val input = intArrayOf(1,3,5,6)
        val target = 0
        val verify = 0

        val result = searchInsertPosition.searchInsert(input, target)

        Assert.assertEquals(result, verify)
    }

}