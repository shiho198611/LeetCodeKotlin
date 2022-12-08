package easy.tree

/**
 * Weak pointer
 * Not write solution by myself.
 * */
class MinimumDepthOfBinaryTree {

    fun minDepth(root: TreeNode?): Int {

        root?.apply {

            var lDepth = 0
            var rDepth = 0

            if (root.right != null) {
                rDepth = 1 + minDepth(root.right)
            } else {
                rDepth++
            }

            if (root.left != null) {
                lDepth = 1 + minDepth(root.left)
            } else {
                lDepth++
            }


            return if ((root.left == null) xor (root.right == null)) {
                lDepth.coerceAtLeast(rDepth)
            } else {
                lDepth.coerceAtMost(rDepth)
            }
        }

        return 0
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}