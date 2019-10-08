package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MinStackTest {

    lateinit var minStack: MinStack

    @Before
    fun initTest() {
        minStack = MinStack()
    }

    @Test
    fun minStack_Test01() {
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)

        Assert.assertEquals(minStack.getMin(), -3)

        minStack.pop()

        Assert.assertEquals(minStack.top(), 0)
        Assert.assertEquals(minStack.getMin(), -2)
    }

}