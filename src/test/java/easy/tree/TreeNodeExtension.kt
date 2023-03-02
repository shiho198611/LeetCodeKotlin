package easy.tree

import java.util.*

fun MutableList<Int?>.array2TreeNode(): TreeNode? {
    if (isEmpty()) {
        return null
    } else {
        val queue = LinkedList<TreeNode?>()
        val value = removeAt(0)
        val root = TreeNode(value!!.toInt())

        queue.add(root)

        while (queue.isNotEmpty() && isNotEmpty()) {
            val node = queue.pop()

            var lv: Int? = null
            if (isNotEmpty()) {
                lv = removeAt(0)
            }

            var rv: Int? = null

            if (isNotEmpty()) {
                rv = removeAt(0)
            }

            if (lv != null) {
                node?.left = TreeNode(lv.toInt())
                queue.add(node?.left)
            }
            if (rv != null) {
                node?.right = TreeNode(rv.toInt())
                queue.add(node?.right)
            }
        }

        return root
    }
}