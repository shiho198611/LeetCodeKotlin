package easy.dp

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PascalTriangleTest {

    private lateinit var pascalTriangle: PascalTriangle

    @Before
    fun initTest() {
        pascalTriangle = PascalTriangle()
    }

    @Test
    fun testCase1() {
        val result = pascalTriangle.generate(5)
        val expect = mutableListOf<List<Int>>(
                mutableListOf(1),
                mutableListOf(1, 1),
                mutableListOf(1, 2, 1),
                mutableListOf(1, 3, 3, 1),
                mutableListOf(1, 4, 6, 4, 1)
        )

        Assert.assertEquals(expect.size, result.size)

        expect.forEachIndexed { index, ints ->
            Assert.assertArrayEquals(ints.toIntArray(), result[index].toIntArray())
        }
    }

    @Test
    fun testCase2() {
        val result = pascalTriangle.generate(1)
        val expect = mutableListOf<List<Int>>(mutableListOf(1))

        Assert.assertEquals(expect.size, result.size)

        expect.forEachIndexed { index, ints ->
            Assert.assertArrayEquals(ints.toIntArray(), result[index].toIntArray())
        }
    }

}