package easy.linkedlist

class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 != null || l2 != null) {
            when {
                l1 == null -> {
                    val node: ListNode? = ListNode(l2!!.`val`)
                    node?.next = mergeTwoLists(null, l2.next)
                    return node
                }
                l2 == null -> {
                    val node: ListNode? = ListNode(l1.`val`)
                    node?.next = mergeTwoLists(l1.next, null)
                    return node
                }
                l1.`val` > l2.`val` -> {
                    val node: ListNode? = ListNode(l2.`val`)
                    node?.next = mergeTwoLists(l1, l2.next)
                    return node
                }
                else -> {
                    val node: ListNode? = ListNode(l1.`val`)
                    node?.next = mergeTwoLists(l1.next, l2)
                    return node
                }
            }
        }

        return null
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}