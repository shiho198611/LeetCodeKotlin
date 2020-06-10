package easy.linkedlist

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LinkedListCycleTest {

    lateinit var linkedListCycle: LinkedListCycle

    @Before
    fun initTest() {
        linkedListCycle = LinkedListCycle()
    }

    @Test
    fun hasCycle_Test01() {

        val head = transfer2ListNode(mutableListOf(3, 2, 0, -4))
        val result = linkedListCycle.hasCycle(head)

        Assert.assertTrue(result)
    }

    @Test
    fun hasCycle_Test02() {

        val head = transfer2ListNode(mutableListOf(1, 2))
        val result = linkedListCycle.hasCycle(head)

        Assert.assertTrue(result)
    }

    @Test
    fun hasCycle_Test03() {

        val head = transfer2ListNode(mutableListOf(1))
        val result = linkedListCycle.hasCycle(head)

        Assert.assertFalse(result)
    }

    private fun transfer2ListNode(list: MutableList<Int>): LinkedListCycle.ListNode? {
        if (list.isNotEmpty()) {
            val node = LinkedListCycle.ListNode(list.removeAt(0))
            node.next = transfer2ListNode(list)
            return node
        }
        return null
    }

}