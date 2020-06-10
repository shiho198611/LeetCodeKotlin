package easy.linkedlist

import java.util.*

class PalindromeLinkedList {

    fun isPalindrome(head: ListNode?): Boolean {

        val queue = LinkedList<ListNode>()
        val valQ = LinkedList<Int>()
        var cur = head

        while (cur != null) {
            queue.add(cur)
            valQ.add(cur.`val`)
            cur = cur.next
        }

        var newNode = reverse(queue)

        while (newNode != null) {
            val value = valQ.pop()
            if(newNode.`val` != value) {
                return false
            }
            newNode = newNode.next
        }

        return true
    }

    fun reverse(queue: LinkedList<ListNode>): ListNode? {
        return if(queue.isEmpty()) {
            null
        }
        else {
            val node = queue.removeLast()
            node.next = reverse(queue)
            node
        }
    }

}