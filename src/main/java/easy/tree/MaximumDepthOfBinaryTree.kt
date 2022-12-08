package easy.tree

/**
 * Weak pointer
 * Not write solution by myself.
 * */
class MaximumDepthOfBinaryTree {

    fun maxDepth(root: TreeNode?): Int {

        if (root == null) return 0

        var lDepth = 0
        var rDepth = 0

        if (root.right != null) {
            rDepth = 1 + maxDepth(root.right)
        } else {
            rDepth++
        }

        if (root.left != null) {
            lDepth = 1 + maxDepth(root.left)
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