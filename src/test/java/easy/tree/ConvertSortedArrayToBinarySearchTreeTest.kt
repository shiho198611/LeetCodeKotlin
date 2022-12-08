package easy.tree

import easy.tree.ConvertSortedArrayToBinarySearchTree.TreeNode
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class ConvertSortedArrayToBinarySearchTreeTest {

    private lateinit var convertSortedArrayToBinarySearchTree: ConvertSortedArrayToBinarySearchTree

    @Before
    fun initTest() {
        convertSortedArrayToBinarySearchTree = ConvertSortedArrayToBinarySearchTree()
    }

    @Test
    fun testCase1() {
        val input = intArrayOf(-10, -3, 0, 5, 9)
        val expect = array2TreeNode(mutableListOf(0, -3, 9, -10, null, 5))

        val result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(input)

        Assert.assertEquals(expect!!.convertString(), result!!.convertString())
    }

    @Test
    fun testCase2() {
        val input = intArrayOf(1, 3)
        val expect = array2TreeNode(mutableListOf(3,1))

        val result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(input)

        Assert.assertEquals(expect!!.convertString(), result!!.convertString())
    }

    private fun TreeNode.convertString(): String {
        return if (left == null && right == null) {
            `val`.toString()
        } else {
            `val`.toString() + left?.convertString() + right?.convertString()
        }
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