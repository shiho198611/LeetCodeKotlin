package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MergeTwoSortedListsTest {

    lateinit var mergeTwoSortedLists: MergeTwoSortedLists

    @Before
    fun initTest() {
        mergeTwoSortedLists = MergeTwoSortedLists()
    }

    @Test
    fun mergeTwoSortedLists_Test01() {

        val node1 = transfer2ListNode(listOf(1, 2, 4).toMutableList())
        val node2 = transfer2ListNode(listOf(1, 3, 4).toMutableList())

        val result = mergeTwoSortedLists.mergeTwoLists(node1, node2)
        val verify = transfer2ListNode(listOf(1,1,2,3,4,4).toMutableList())

        Assert.assertArrayEquals(result.transfer2Array(), verify.transfer2Array())
    }

    @Test
    fun mergeTwoSortedLists_Test02() {

        val node1 = transfer2ListNode(listOf(-9, 3).toMutableList())
        val node2 = transfer2ListNode(listOf(5, 7).toMutableList())

        val result = mergeTwoSortedLists.mergeTwoLists(node1, node2)
        val verify = transfer2ListNode(listOf(-9,3,5,7).toMutableList())

        Assert.assertArrayEquals(result.transfer2Array(), verify.transfer2Array())
    }

    fun transfer2ListNode(list: MutableList<Int>): MergeTwoSortedLists.ListNode? {
        if(list.isNotEmpty()) {
            val node = MergeTwoSortedLists.ListNode(list.removeAt(0))
            node.next = transfer2ListNode(list)
            return node
        }
        return null
    }

    fun MergeTwoSortedLists.ListNode?.transfer2Array(): IntArray {
        var node = this
        val nodeList = mutableListOf<Int>()

        while (node != null) {
            nodeList.add(node.`val`)
            node = node.next
        }

        return nodeList.toIntArray()
    }

}