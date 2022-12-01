package easy.tree

import org.junit.Before
import org.junit.Test
import java.util.*
import easy.tree.SameTree.TreeNode
import org.junit.Assert

class SameTreeTest {

    private lateinit var sameTree: SameTree

    @Before
    fun initTest() {
        sameTree = SameTree()
    }

    @Test
    fun testCase1() {
        val p = array2TreeNode(mutableListOf(1, 2, 3))
        val q = array2TreeNode(mutableListOf(1, 2, 3))

        val result = sameTree.isSameTree(p, q)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val p = array2TreeNode(mutableListOf(1, 2))
        val q = array2TreeNode(mutableListOf(1, null, 2))

        val result = sameTree.isSameTree(p, q)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val p = array2TreeNode(mutableListOf(1, 2, 1))
        val q = array2TreeNode(mutableListOf(1, 1, 2))

        val result = sameTree.isSameTree(p, q)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase4() {
        val p = array2TreeNode(mutableListOf())
        val q = array2TreeNode(mutableListOf())

        val result = sameTree.isSameTree(p, q)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase5() {
        val p = array2TreeNode(mutableListOf(1))
        val q = array2TreeNode(mutableListOf(1, null, 2))

        val result = sameTree.isSameTree(p, q)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase6() {
        val p = array2TreeNode(mutableListOf(1, 2, 3, null, null, 4, 5))
        val q = array2TreeNode(mutableListOf(1, 2, 3))

        val result = sameTree.isSameTree(p, q)

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