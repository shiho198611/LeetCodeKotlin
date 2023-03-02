package easy.tree

import org.junit.Assert
import org.junit.Test
import java.util.*

class BinaryTreePreorderTraversalTest {

    private val binaryTreePreorderTraversal = BinaryTreePreorderTraversal()

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(1, null, 2, 3))
        val verify = listOf(1, 2, 3)

        val actual = binaryTreePreorderTraversal.preorderTraversal(input)

        Assert.assertArrayEquals(verify.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf())
        val verify = emptyList<Int>()

        val actual = binaryTreePreorderTraversal.preorderTraversal(input)

        Assert.assertArrayEquals(verify.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf(1))
        val verify = listOf(1)

        val actual = binaryTreePreorderTraversal.preorderTraversal(input)

        Assert.assertArrayEquals(verify.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(3, 1, 2))
        val verify = listOf(3, 1, 2)

        val actual = binaryTreePreorderTraversal.preorderTraversal(input)

        Assert.assertArrayEquals(verify.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase5() {
        val input = array2TreeNode(mutableListOf(1, 4, 3, 2))
        val verify = listOf(1, 4, 2, 3)

        val actual = binaryTreePreorderTraversal.preorderTraversal(input)

        Assert.assertArrayEquals(verify.toIntArray(), actual.toIntArray())
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