package easy.tree

import org.junit.Before
import org.junit.Test
import easy.tree.PathSum.TreeNode
import org.junit.Assert
import java.util.*

class PathSumTest {

    private lateinit var pathSum: PathSum

    @Before
    fun initTest() {
        pathSum = PathSum()
    }

    @Test
    fun testCase1() {
        val input = array2TreeNode(mutableListOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1))
        val result = pathSum.hasPathSum(input, 22)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val input = array2TreeNode(mutableListOf(1, 2, 3))
        val result = pathSum.hasPathSum(input, 5)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val input = array2TreeNode(mutableListOf())
        val result = pathSum.hasPathSum(input, 0)

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