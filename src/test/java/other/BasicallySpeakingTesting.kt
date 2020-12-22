package other

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import other.BasicallySpeaking

class BasicallySpeakingTesting {

    lateinit var basicallySpeaking: BasicallySpeaking

    @Before
    fun init() {
        basicallySpeaking = BasicallySpeaking()
    }

    @Test
    fun testCase() {
        Assert.assertTrue(basicallySpeaking.speaking(("1111000 2 10")) == "0000120");
        Assert.assertTrue(basicallySpeaking.speaking(("1111000 2 16")) == "0000078");
        Assert.assertTrue(basicallySpeaking.speaking(("2102101 3 10")) == "0001765");
        Assert.assertTrue(basicallySpeaking.speaking(("2102101 3 15")) == "00007CA");
        Assert.assertTrue(basicallySpeaking.speaking(("12312 4 2")) == "0110110");
        Assert.assertTrue(basicallySpeaking.speaking(("1A 15 2")) == "0011001");
        Assert.assertTrue(basicallySpeaking.speaking(("ABCD 16 15")) == "000D071");
        Assert.assertTrue(basicallySpeaking.speaking(("03 13 10")) == "0000003");
        Assert.assertTrue(basicallySpeaking.speaking("0055 6 3") == "0001022");
        Assert.assertTrue(basicallySpeaking.speaking("0055 8 10") == "0000045");
        Assert.assertTrue(basicallySpeaking.speaking("5500 10 16") == "000157C");
        Assert.assertTrue(basicallySpeaking.speaking("5500 8 10") == "0002880");
        Assert.assertTrue(basicallySpeaking.speaking("768 10 2") == "0000000");
        Assert.assertTrue(basicallySpeaking.speaking("768 10 8") == "0001400");
        Assert.assertTrue(basicallySpeaking.speaking("1234 7 3") == "0122021");
        Assert.assertTrue(basicallySpeaking.speaking("1234 7 5") == "0003331");
        Assert.assertTrue(basicallySpeaking.speaking("00001111 2 10") == "0000015");
        Assert.assertTrue(basicallySpeaking.speaking("00001111 3 10") == "0000040");
        Assert.assertTrue(basicallySpeaking.speaking("00001111 4 10") == "0000085");
        Assert.assertTrue(basicallySpeaking.speaking("00001111 5 10") == "0000156");
        Assert.assertTrue(basicallySpeaking.speaking("AACC 16 10") == "0043724");
        Assert.assertTrue(basicallySpeaking.speaking("AACC 15 10") == "0036192");
        Assert.assertTrue(basicallySpeaking.speaking("FFFF 16 2") == "1111111");
    }

}