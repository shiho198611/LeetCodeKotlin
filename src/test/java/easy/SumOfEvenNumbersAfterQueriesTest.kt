package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SumOfEvenNumbersAfterQueriesTest {

    lateinit var sumOfEvenNumbersAfterQueries: SumOfEvenNumbersAfterQueries

    @Before
    fun initTest() {
        sumOfEvenNumbersAfterQueries = SumOfEvenNumbersAfterQueries()
    }

    @Test
    fun sumOfEvenNumbersAfterQueries_Test01() {
        val input = intArrayOf(1,2,3,4)
        val queries = arrayOf(intArrayOf(1,0),
                intArrayOf(-3,1), intArrayOf(-4,0), intArrayOf(2,3))

        val verify = intArrayOf(8,6,2,4)

        val result = sumOfEvenNumbersAfterQueries.sumEvenAfterQueries(input, queries)

        Assert.assertArrayEquals(result, verify)
    }

}