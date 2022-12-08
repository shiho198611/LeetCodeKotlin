package easy.tree

import org.junit.Before
import org.junit.Test
import easy.tree.MinimumDepthOfBinaryTree.TreeNode
import org.junit.Assert
import java.util.*

class MinimumDepthOfBinaryTreeTest {

    private lateinit var minimumDepthOfBinaryTree: MinimumDepthOfBinaryTree

    @Before
    fun initTest() {
        minimumDepthOfBinaryTree = MinimumDepthOfBinaryTree()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(3, 9, 20, null, null, 15, 7))
        val result = minimumDepthOfBinaryTree.minDepth(input)

        Assert.assertEquals(2, result)
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf(2, null, 3, null, 4, null, 5, null, 6))
        val result = minimumDepthOfBinaryTree.minDepth(input)

        Assert.assertEquals(5, result)
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf(1, 2, 3, 4, 5))
        val result = minimumDepthOfBinaryTree.minDepth(input)

        Assert.assertEquals(2, result)
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8))
        val result = minimumDepthOfBinaryTree.minDepth(input)

        Assert.assertEquals(4, result)
    }

    private fun array2TreeNode(input: MutableList<Int?>): TreeNode? {
        if (input.isEmpty()) {
            return null
        } else {
            val queue = LinkedList<TreeNode?>()
            val value = input.removeAt(0)
            val root = TreeNode(value!!.toInt())

            queue.add(root)

            while (queue.isNotEmpty() && input.isNotEmpty()) {
                val node = queue.pop()

                var lv: Int? = null
                if (input.isNotEmpty()) {
                    lv = input.removeAt(0)
                }

                var rv: Int? = null

                if (input.isNotEmpty()) {
                    rv = input.removeAt(0)
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
}