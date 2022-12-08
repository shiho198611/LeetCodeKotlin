package easy.tree

import org.junit.Before
import org.junit.Test
import easy.tree.BalancedBinaryTree.TreeNode
import org.junit.Assert
import java.util.*

class BalancedBinaryTreeTest {

    private lateinit var balancedBinaryTree: BalancedBinaryTree

    @Before
    fun initTest() {
        balancedBinaryTree = BalancedBinaryTree()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(3, 9, 20, null, null, 15, 7))
        val result = balancedBinaryTree.isBalanced(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf(1, 2, 2, 3, 3, null, null, 4, 4))
        val result = balancedBinaryTree.isBalanced(input)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf())
        val result = balancedBinaryTree.isBalanced(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(1, 2, 2, 3, null, null, 3, 4, null, null, 4))
        val result = balancedBinaryTree.isBalanced(input)

        Assert.assertFalse(result)
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