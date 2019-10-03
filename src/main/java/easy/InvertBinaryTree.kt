package easy

import java.util.*


class InvertBinaryTree {

    fun invertTree(root: TreeNode?): TreeNode? {
        return if (root == null) {
            null
        } else {
            val nodes: Queue<TreeNode> = LinkedList()

            nodes.add(root)

            while (nodes.isNotEmpty()) {
                val node = nodes.poll()
                if (node != null && (node.left != null || node.right != null)) {
                    val tmp = node.right
                    node.right = node.left
                    node.left = tmp

                    nodes.add(node.right)
                    nodes.add(node.left)
                }
            }
            root
        }
    }


    fun recursiveInvertTree(root: TreeNode?): TreeNode? {
        return if (root == null) {
            null
        } else {
            invert(root)
        }
    }

    fun invert(node: TreeNode?): TreeNode? {
        val lTmp = node?.left
        val rTmp = node?.right
        node?.left = invert(rTmp)
        node?.right = invert(lTmp)
        return node
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}