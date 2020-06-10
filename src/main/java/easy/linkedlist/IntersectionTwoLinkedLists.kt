package easy.linkedlist

class IntersectionTwoLinkedLists {

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {

        var diff = diffSize(headA, headB)

        var curA = headA
        var curB = headB

        while (curA != null && curB != null) {
            if(diff != 0) {
                if(diff > 0) {
                    diff--
                    curA = curA.next
                }
                else {
                    diff++
                    curB = curB.next
                }
            }
            else {
                if(curA == curB) {
                    return curA
                }
                else {
                    curA = curA.next
                    curB = curB.next
                }
            }
        }

        return null
    }

    fun diffSize(headA: ListNode?, headB: ListNode?): Int {
        var curA = headA
        var curB = headB

        var diff = 0
        while (curA != null || curB != null) {
            if(curA == null) {
                curB = curB!!.next
                diff--
            }
            else if(curB == null) {
                curA = curA.next
                diff++
            }
            else {
                curA = curA.next
                curB = curB.next
            }
        }

        return diff
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}