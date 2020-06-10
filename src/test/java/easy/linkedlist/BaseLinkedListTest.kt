package easy.linkedlist

abstract class BaseLinkedListTest {

    fun transfer2ReverseLinkedList(nums: MutableList<Int>): ListNode? {

        if (nums.isNotEmpty()) {
            val node = ListNode(nums.removeAt(0))
            node.next = transfer2ReverseLinkedList(nums)
            return node
        }

        return null
    }

    fun ListNode?.transfer2Array(): IntArray {
        var node: ListNode? = this
        val resultList = mutableListOf<Int>()
        while (node != null) {
            resultList.add(node.`val`)
            node = node.next
        }

        return resultList.toIntArray()
    }

}