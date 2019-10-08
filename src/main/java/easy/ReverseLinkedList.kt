package easy

import java.util.*

class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {

        if(head == null) {
            return null
        }
        else {
            val nodeStack = LinkedList<ListNode>()
            var node = head
            while (node != null) {
                nodeStack.add(node)
                node = node.next
            }

            return reverse(nodeStack)
        }
    }

    fun reverse(stack: LinkedList<ListNode>): ListNode? {
        return if(stack.isEmpty()) {
            null
        }
        else {
            val node = stack.removeLast()
            node.next = reverse(stack)

            node
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}