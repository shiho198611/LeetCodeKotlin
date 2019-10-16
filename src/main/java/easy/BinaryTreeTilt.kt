package easy

import kotlin.math.abs

class BinaryTreeTilt {

    var result = 0

    fun findTilt(root: TreeNode?): Int {
        if (root != null) {
            nodeSum(root)
        }
        return result
    }

    fun nodeSum(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            val left = nodeSum(root.left)
            val right = nodeSum(root.right)

            result += abs(left - right)

            left + right + root.`val`
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}