package easy.tree

import org.junit.Assert
import org.junit.Test

class BinaryTreePostorderTraversalTest {

    private val binaryTreePostorderTraversal = BinaryTreePostorderTraversal()

    @Test
    fun testCase1() {
        val input = mutableListOf(1, null, 2, 3).array2TreeNode()
        val expect = mutableListOf(3, 2, 1)

        val actual = binaryTreePostorderTraversal.postorderTraversal(input)

        Assert.assertArrayEquals(expect.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase2() {
        val input = mutableListOf<Int?>().array2TreeNode()
        val expect = emptyList<Int>()

        val actual = binaryTreePostorderTraversal.postorderTraversal(input)

        Assert.assertArrayEquals(expect.toIntArray(), actual.toIntArray())
    }

    @Test
    fun testCase3() {
        val input = mutableListOf<Int?>(1).array2TreeNode()
        val expect = mutableListOf(1)

        val actual = binaryTreePostorderTraversal.postorderTraversal(input)

        Assert.assertArrayEquals(expect.toIntArray(), actual.toIntArray())
    }
}