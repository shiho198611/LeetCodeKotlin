package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class InvertBinaryTreeTest {

    lateinit var invertBinaryTree: InvertBinaryTree

    @Before
    fun initTest() {
        invertBinaryTree = InvertBinaryTree()
    }

    @Test
    fun invertBinaryTree_Test01() {
        val root = InvertBinaryTree.TreeNode(4)

        root.left = InvertBinaryTree.TreeNode(2)
        root.left!!.left = InvertBinaryTree.TreeNode(1)
        root.left!!.right = InvertBinaryTree.TreeNode(3)

        root.right = InvertBinaryTree.TreeNode(7)
        root.right!!.left = InvertBinaryTree.TreeNode(6)
        root.right!!.right = InvertBinaryTree.TreeNode(9)


        val verify = InvertBinaryTree.TreeNode(4)

        verify.left = InvertBinaryTree.TreeNode(7)
        verify.left!!.right = InvertBinaryTree.TreeNode(6)
        verify.left!!.left = InvertBinaryTree.TreeNode(9)

        verify.right = InvertBinaryTree.TreeNode(2)
        verify.right!!.right = InvertBinaryTree.TreeNode(1)
        verify.right!!.left = InvertBinaryTree.TreeNode(3)

        val result = invertBinaryTree.invertTree(root)

        Assert.assertEquals(result!!.convertString(), verify.convertString())
    }

    @Test
    fun invertBinaryTree_Test02() {
        val root = InvertBinaryTree.TreeNode(1)

        root.left = InvertBinaryTree.TreeNode(2)

        val verify = InvertBinaryTree.TreeNode(1)

        verify.right = InvertBinaryTree.TreeNode(2)

        val result = invertBinaryTree.invertTree(root)

        Assert.assertEquals(result!!.convertString(), verify.convertString())
    }

    private fun InvertBinaryTree.TreeNode.convertString(): String {
        return if(left == null && right == null) {
            `val`.toString()
        }
        else {
            `val`.toString()+left?.convertString()+right?.convertString()
        }
    }

}