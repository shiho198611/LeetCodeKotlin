package easy.tree

import java.util.*

/**
 * Weak pointer
 * Not enough practice for regular DS problem.
 * */
class BalancedBinaryTree {

    fun isBalanced(root: TreeNode?): Boolean {

        root?.apply {
            val stack = Stack<TreeNode>()
            stack.push(root)

            while (stack.isNotEmpty()) {

                val node = stack.pop()

                if(Math.abs(getDepth(node.left).minus(getDepth(node.right))) > 1) {
                    return false
                }

                if(node.left != null) {
                    stack.push(node.left)
                }
                if(node.right != null) {
                    stack.push(node.right)
                }
            }

        }

        return true
    }

    private fun getDepth(node: TreeNode?): Int {
        if (node == null) return 0
        var lDepth = 0
        var rDepth = 0

        if (node.right != null) {
            rDepth = 1 + getDepth(node.right)
        } else {
            rDepth++
        }

        if (node.left != null) {
            lDepth = 1 + getDepth(node.left)
        } else {
            lDepth++
        }

        return lDepth.coerceAtLeast(rDepth)
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}