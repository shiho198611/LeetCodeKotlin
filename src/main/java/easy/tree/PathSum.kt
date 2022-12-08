package easy.tree

class PathSum {

    var result = false

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        if (root == null) return false

        checkSum(root, targetSum)

        return result
    }

    fun checkSum(node: TreeNode?, sum: Int) {
        if (node?.left == null && node?.right == null && !result) {
            val params = sum - node?.`val`!!
            result = params == 0
        } else {
            if (node?.left != null) {
                checkSum(node.left, sum - node.`val`)
            }
            if (node?.right != null) {
                checkSum(node.right, sum - node.`val`)
            }
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}