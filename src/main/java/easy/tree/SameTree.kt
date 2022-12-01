package easy.tree

import java.util.Stack

class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

        val pStack = Stack<TreeNode?>()
        val qStack = Stack<TreeNode?>()

        pStack.push(p)
        qStack.push(q)

        while (pStack.isNotEmpty()) {

            if(qStack.isEmpty()) return false

            val pT = pStack.pop()
            val qT = qStack.pop()

            if(pT?.`val` != qT?.`val`) {
                return false
            } else {

                if(pT?.right != null || pT?.left != null) {
                    pStack.push(pT.right)
                    pStack.push(pT.left)
                }

                if(qT?.right != null || qT?.left != null) {
                    qStack.push(qT.right)
                    qStack.push(qT.left)
                }
            }
        }

        return qStack.isEmpty()
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}