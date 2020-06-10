package easy.linkedlist

import java.util.*

class RemoveLinkedListElements {

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var current = head
        var last: ListNode? = null
        var newHead = head

        while (current != null) {
            if(current.`val` == `val`) {
                if(last == null) {
                    current = current.next
                    newHead = current
                }
                else {
                    last.next = current.next
                    current.next = null
                    current = last.next
                }
            }
            else {
                last = current
                current = current.next
            }
        }

        return newHead
    }

    fun removeElementsOrigin(head: ListNode?, `val`: Int): ListNode? {

        val queue = LinkedList<ListNode>()
        var cur = head

        while (cur != null) {
            if(cur.`val` != `val`) {
                queue.add(cur)
            }
            cur = cur.next
        }

        return combineList(queue)
    }

    private fun combineList(queue: LinkedList<ListNode>): ListNode? {
        return if(queue.isEmpty()) {
            null
        }
        else {
            val node = queue.pop()
            node.next = combineList(queue)
            node
        }
    }

}