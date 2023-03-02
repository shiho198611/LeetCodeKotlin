package easy.tree

import java.util.Stack

class BinaryTreePreorderTraversal {

    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        val stack = Stack<TreeNode?>()
        stack.push(root)

        while (stack.isNotEmpty()) {
            val node = stack.pop()

            if(node != null) {
                result.add(node.`val`)
                stack.push(node.right)
                stack.push(node.left)
            }
        }

        return result
    }

}