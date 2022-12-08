package easy.tree

import easy.tree.MaximumDepthOfBinaryTree.TreeNode
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class MaximumDepthOfBinaryTreeTest {

    private lateinit var maximumDepthOfBinaryTree: MaximumDepthOfBinaryTree

    @Before
    fun initTest() {
        maximumDepthOfBinaryTree = MaximumDepthOfBinaryTree()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(3, 9, 20, null, null, 15, 7))
        val result = maximumDepthOfBinaryTree.maxDepth(input)

        Assert.assertEquals(3, result)
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf(1, null, 2))
        val result = maximumDepthOfBinaryTree.maxDepth(input)

        Assert.assertEquals(2, result)
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf(1, 2, 3, 4, null, null, 5))
        val result = maximumDepthOfBinaryTree.maxDepth(input)

        Assert.assertEquals(3, result)
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8))
        val result = maximumDepthOfBinaryTree.maxDepth(input)

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