package easy.tree

import java.util.Stack

class BinaryTreeInorderTraversal {

    fun inorderTraversal(root: TreeNode?): List<Int> {

        val result = mutableListOf<Int>()

        root?.apply {
            val stack = Stack<TreeNode>()

            stack.push(root)

            while (stack.isNotEmpty()) {
                val node = stack.pop()

                if(node.right != null) {
                    val tmp = node.right
                    node.right = null
                    stack.push(tmp)
                }

                if(node.left != null) {
                    val tmp = node.left
                    node.left = null
                    stack.push(node)
                    stack.push(tmp)
                } else {
                    result.add(node.`val`)
                }

            }
        }

        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}