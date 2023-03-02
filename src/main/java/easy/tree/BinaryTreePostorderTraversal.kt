package easy.tree

import java.util.Stack

class BinaryTreePostorderTraversal {

    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        val stack = Stack<TreeNode?>()
        stack.push(root)

        while (stack.isNotEmpty()) {

            val node = stack.pop() ?: continue

            if(node.left != null || node.right != null) {

                val left = node.left
                val right = node.right

                node.left = null
                node.right = null

                stack.push(node)
                stack.push(right)
                stack.push(left)
            } else {
                result.add(node.`val`)
            }

        }

        return result
    }
}