package easy

import easy.array.MinimumAbsoluteDifference
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MinimumAbsoluteDifferenceTest {

    lateinit var minimumAbsoluteDifference: MinimumAbsoluteDifference

    @Before
    fun initTest() {
        minimumAbsoluteDifference = MinimumAbsoluteDifference()
    }

    @Test
    fun minimumAbsoluteDifference_Test01() {
        val arr = intArrayOf(4,2,1,3)
        val verify = listOf(listOf(1,2), listOf(2,3), listOf(3,4))

        val result = minimumAbsoluteDifference.minimumAbsDifference(arr)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minimumAbsoluteDifference_Test02() {
        val arr = intArrayOf(1,3,6,10,15)
        val verify = listOf(listOf(1,3))

        val result = minimumAbsoluteDifference.minimumAbsDifference(arr)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minimumAbsoluteDifference_Test03() {
        val arr = intArrayOf(3,8,-10,23,19,-4,-14,27)
        val verify = listOf(listOf(-14,-10), listOf(19,23), listOf(23,27))

        val result = minimumAbsoluteDifference.minimumAbsDifference(arr)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minimumAbsoluteDifference_Test04() {
        val arr = intArrayOf(40,11,26,27,-20)
        val verify = listOf(listOf(26,27))

        val result = minimumAbsoluteDifference.minimumAbsDifference(arr)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minimumAbsoluteDifference_Test05() {
        val arr = intArrayOf(188,9,-189,-112,165,4,-141,179,-154,258,53,71,201,204,121,215,259,-22,34,-213,-88,-192,118,-221,130,-86,209)
        val verify = listOf(listOf(258,259))

        val result = minimumAbsoluteDifference.minimumAbsDifference(arr)

        Assert.assertEquals(result, verify)
    }

}