package easy.linkedlist

class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null && current.next != null) {
            if(current.`val` == current.next!!.`val`) {
                current.next = current.next!!.next
            }
            else {
                current = current.next
            }
        }

        return head
    }

    fun deleteDuplicatesOrigin(head: ListNode?): ListNode? {
        return recursiveNode(head)
    }

    fun recursiveNode(list: ListNode?): ListNode? {
        if(list == null) {
            return null
        }
        else {
            val next = list.next
            if(next != null) {
                if(next.`val` != list.`val`) {

                    list.next = recursiveNode(next)

                    return list
                }
                else {
                    return recursiveNode(next)
                }
            }
            else {
                list.next = null
                return list
            }

        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}