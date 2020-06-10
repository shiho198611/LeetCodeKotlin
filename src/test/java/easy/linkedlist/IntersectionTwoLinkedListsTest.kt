package easy.linkedlist

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IntersectionTwoLinkedListsTest {

    lateinit var intersection: IntersectionTwoLinkedLists

    @Before
    fun initTest() {
        intersection = IntersectionTwoLinkedLists()
    }

    @Test
    fun getIntersectionNode_Test01() {
        val headA = transfer2ListNode(mutableListOf(4, 1, 8, 4, 5))
        val headB = transfer2ListNode(mutableListOf(5, 0, 1, 8, 4, 5))

        val result = intersection.getIntersectionNode(headA, headB)

        Assert.assertEquals(result!!.`val`, 8)
    }


    @Test
    fun getIntersectionNode_Test02() {
        val headA = transfer2ListNode(mutableListOf(0, 9, 1, 2, 4))
        val headB = transfer2ListNode(mutableListOf(3, 2, 4))

        val result = intersection.getIntersectionNode(headA, headB)

        Assert.assertEquals(result!!.`val`, 2)
    }

    @Test
    fun getIntersectionNode_Test03() {
        val headA = transfer2ListNode(mutableListOf(2, 6, 4))
        val headB = transfer2ListNode(mutableListOf(1, 5))

        val result = intersection.getIntersectionNode(headA, headB)

        Assert.assertNull(result)
    }

    private fun transfer2ListNode(list: MutableList<Int>): IntersectionTwoLinkedLists.ListNode? {
        if (list.isNotEmpty()) {
            val node = IntersectionTwoLinkedLists.ListNode(list.removeAt(0))
            node.next = transfer2ListNode(list)
            return node
        }
        return null
    }
}