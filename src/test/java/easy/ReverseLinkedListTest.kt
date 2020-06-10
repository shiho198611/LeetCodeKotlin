package easy

import easy.linkedlist.ReverseLinkedList
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ReverseLinkedListTest {

    lateinit var reverseLinkedList: ReverseLinkedList

    @Before
    fun initTest() {
        reverseLinkedList = ReverseLinkedList()
    }

    @Test
    fun reverseLinkedList_Test01() {
        val head = transfer2ReverseLinkedList(mutableListOf(1,2,3,4,5))
        val verify = transfer2ReverseLinkedList(mutableListOf(5,4,3,2,1))

        val result = reverseLinkedList.reverseList(head)

        Assert.assertArrayEquals(result?.transfer2Array(), verify?.transfer2Array())
    }

    @Test
    fun reverseLinkedList_Test02() {
        val head = transfer2ReverseLinkedList(mutableListOf(5,4,3,2,1))
        val verify = transfer2ReverseLinkedList(mutableListOf(1,2,3,4,5))

        val result = reverseLinkedList.reverseList(head)

        Assert.assertArrayEquals(result?.transfer2Array(), verify?.transfer2Array())
    }

    fun transfer2ReverseLinkedList(nums: MutableList<Int>): ReverseLinkedList.ListNode? {

        if(nums.isNotEmpty()) {
            val node = ReverseLinkedList.ListNode(nums.removeAt(0))
            node.next = transfer2ReverseLinkedList(nums)
            return node
        }

        return null
    }

    fun ReverseLinkedList.ListNode.transfer2Array(): IntArray {
        var node: ReverseLinkedList.ListNode? = this
        val resultList = mutableListOf<Int>()
        while (node != null) {
            resultList.add(node.`val`)
            node = node.next
        }

        return resultList.toIntArray()
    }

}