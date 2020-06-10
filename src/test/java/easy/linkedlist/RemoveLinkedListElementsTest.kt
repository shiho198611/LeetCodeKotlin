package easy.linkedlist

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RemoveLinkedListElementsTest : BaseLinkedListTest() {

    lateinit var removeList: RemoveLinkedListElements

    @Before
    fun initTest() {
        removeList = RemoveLinkedListElements()
    }

    @Test
    fun removeElements_Test01() {
        val head =
                transfer2ReverseLinkedList(mutableListOf(1, 2, 6, 3, 4, 5, 6))
        val remove = 6

        val result = removeList.removeElements(head, remove)
        val verify = intArrayOf(1, 2, 3, 4, 5)

        Assert.assertArrayEquals(result!!.transfer2Array(), verify)
    }

    @Test
    fun removeElements_Test02() {
        val head =
                transfer2ReverseLinkedList(mutableListOf(1))
        val remove = 1

        val result = removeList.removeElements(head, remove)
        val verify = intArrayOf()

        Assert.assertArrayEquals(result.transfer2Array(), verify)
    }

    @Test
    fun removeElements_Test03() {
        val head =
                transfer2ReverseLinkedList(mutableListOf(1, 1))
        val remove = 1

        val result = removeList.removeElements(head, remove)
        val verify = intArrayOf()

        Assert.assertArrayEquals(result.transfer2Array(), verify)
    }

}