package easy.string

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class AddBinaryTest {

    lateinit var addBinary: AddBinary

    @Before
    fun initTest() {
        addBinary = AddBinary()
    }

    @Test
    fun addBinary_Test01() {
        val a = "11"
        val b = "1"
        val verify = "100"
        val result = addBinary.addBinary(a, b)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun addBinary_Test02() {
        val a = "1010"
        val b = "1011"
        val verify = "10101"
        val result = addBinary.addBinary(a, b)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun addBinary_Test03() {

        val a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        val b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        val verify = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
        val result = addBinary.addBinary(a, b)

        Assert.assertEquals(result, verify)
    }

}