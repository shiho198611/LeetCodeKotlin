package easy.tree

import java.util.*
import easy.tree.SymmetricTree.TreeNode
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SymmetricTreeTest {

    private lateinit var symmetricTree: SymmetricTree

    @Before
    fun initTest() {
        symmetricTree = SymmetricTree()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(1, 2, 2, 3, 4, 4, 3))
        val result = symmetricTree.isSymmetric(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf(1, 2, 2, null, 3, null, 3))
        val result = symmetricTree.isSymmetric(input)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf(1))
        val result = symmetricTree.isSymmetric(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase4() {
        val input = array2TreeNode(mutableListOf(1, 2, 2, null, 3, 3))
        val result = symmetricTree.isSymmetric(input)

        Assert.assertTrue(result)
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