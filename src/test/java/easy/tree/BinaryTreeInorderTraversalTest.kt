package easy.tree

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.LinkedList

class BinaryTreeInorderTraversalTest {

    private lateinit var binaryTreeInorderTraversal: BinaryTreeInorderTraversal

    @Before
    fun initTest() {
        binaryTreeInorderTraversal = BinaryTreeInorderTraversal()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(1, null, 2, 3))
        val result = binaryTreeInorderTraversal.inorderTraversal(input)

        Assert.assertArrayEquals(result.toIntArray(), intArrayOf(1, 3, 2))
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf())
        val result = binaryTreeInorderTraversal.inorderTraversal(input)

        Assert.assertArrayEquals(result.toIntArray(), intArrayOf())
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf(1))
        val result = binaryTreeInorderTraversal.inorderTraversal(input)

        Assert.assertArrayEquals(result.toIntArray(), intArrayOf(1))
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(3, 1, 2))
        val result = binaryTreeInorderTraversal.inorderTraversal(input)

        Assert.assertArrayEquals(result.toIntArray(), intArrayOf(1, 3, 2))
    }

    private fun array2TreeNode(input: MutableList<Int?>): BinaryTreeInorderTraversal.TreeNode? {
        if (input.isEmpty()) {
            return null
        } else {
            val queue = LinkedList<BinaryTreeInorderTraversal.TreeNode?>()
            val value = input.removeAt(0)
            val root = BinaryTreeInorderTraversal.TreeNode(value!!.toInt())

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
                    node?.left = BinaryTreeInorderTraversal.TreeNode(lv.toInt())
                    queue.add(node?.left)
                }
                if (rv != null) {
                    node?.right = BinaryTreeInorderTraversal.TreeNode(rv.toInt())
                    queue.add(node?.right)
                }
            }

            return root
        }

    }
}