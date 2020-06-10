package easy.linkedlist

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class RemoveDuplicatesFromSortedListTest {

    lateinit var removeDuplicate: RemoveDuplicatesFromSortedList

    @Before
    fun initTest() {
        removeDuplicate = RemoveDuplicatesFromSortedList()
    }

    @Test
    fun deleteDuplicates_Test01() {
        val inputList = transfer2ListNode(listOf(1, 1, 2).toMutableList())

        val result = removeDuplicate.deleteDuplicates(inputList)
        val verify = intArrayOf(1, 2)

        Assert.assertArrayEquals(transfer2Array(result!!), verify)
    }

    @Test
    fun deleteDuplicates_Test02() {
        val inputList = transfer2ListNode(listOf(1, 1, 2, 3, 3).toMutableList())

        val result = removeDuplicate.deleteDuplicates(inputList)
        val verify = intArrayOf(1, 2, 3)

        Assert.assertArrayEquals(transfer2Array(result!!), verify)
    }

    private fun transfer2ListNode(list: MutableList<Int>): RemoveDuplicatesFromSortedList.ListNode? {

        if (list.isNotEmpty()) {
            val node = RemoveDuplicatesFromSortedList.ListNode(list.removeAt(0))
            node.next = transfer2ListNode(list)
            return node
        }
        return null
    }

    private fun transfer2Array(list: RemoveDuplicatesFromSortedList.ListNode): IntArray {
        val queue = LinkedList<RemoveDuplicatesFromSortedList.ListNode>()
        val arrayList = mutableListOf<Int>()

        queue.add(list)

        while (queue.isNotEmpty()) {
            val node = queue.pop()
            arrayList.add(node.`val`)
            if (node.next != null) {
                queue.add(node.next!!)
            }
        }

        return arrayList.toIntArray()
    }

}