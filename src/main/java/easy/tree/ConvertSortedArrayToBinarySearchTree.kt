package easy.tree

/**
 * Weak pointer
 * Not write solution by myself.
 * */
class ConvertSortedArrayToBinarySearchTree {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {

        if(nums.isEmpty()) return null
        if(nums.size == 1) return TreeNode(nums[0])

        val middle = nums.size.div(2)
        val node = TreeNode(nums[middle])
        node.left = sortedArrayToBST(nums.sliceArray(0 until middle))
        node.right = sortedArrayToBST(nums.sliceArray(middle + 1..nums.lastIndex))

        return node
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}