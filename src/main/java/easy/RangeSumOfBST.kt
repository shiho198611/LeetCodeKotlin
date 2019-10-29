package easy

class RangeSumOfBST {

    var result = 0

    fun rangeSumBST(root: TreeNode?, L: Int, R: Int): Int {
        if(root == null) {
            return 0
        }
        rangeSum(root, L, R)
        return result
    }

    fun rangeSum(root: TreeNode?, L: Int, R: Int) {
        if(root != null) {
            if(root.`val` >= L && root.`val` <= R) {
                result += root.`val`
            }
            if(root.`val` > L) {
                rangeSum(root.left, L, R)
            }
            if(root.`val` < R) {
                rangeSum(root.right, L, R)
            }
        }

    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}