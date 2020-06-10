package easy.linkedlist
/**
 * Special Problem
 */
class LinkedListCycle {

    fun hasCycle(head: ListNode?): Boolean {

        val set = mutableSetOf<ListNode>()

        var current = head

        while (current != null) {
            if(set.contains(current)) {
                return true
            }
            else {
                set.add(current)
            }
            current = current.next
        }

        return false
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}