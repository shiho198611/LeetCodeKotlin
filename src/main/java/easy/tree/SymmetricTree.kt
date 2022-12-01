package easy.tree

import java.util.Stack

class SymmetricTree {

    fun isSymmetric(root: TreeNode?): Boolean {

        if (root?.left == null && root?.right == null) return true

        val rStack = Stack<TreeNode>()
        val lStack = Stack<TreeNode>()

        rStack.push(root.right)
        lStack.push(root.left)

        while (lStack.isNotEmpty()) {
            if (rStack.isEmpty()) return false

            val lT = lStack.pop()
            val rT = rStack.pop()

            if(lT?.`val` != rT?.`val`) {
                return false
            } else {
                if(lT?.left != null || lT?.right != null) {
                    lStack.push(lT.right)
                    lStack.push(lT.left)
                }

                if(rT?.left != null || rT?.right != null) {
                    rStack.push(rT.left)
                    rStack.push(rT.right)
                }
            }
        }


        return rStack.isEmpty()
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}