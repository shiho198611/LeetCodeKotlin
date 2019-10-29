package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class RangeSumOfBSTTest {

    lateinit var rangeSumOfBST: RangeSumOfBST

    @Before
    fun initTest() {
        rangeSumOfBST = RangeSumOfBST()
    }

    @Test
    fun rangeSumBST_Test01() {
        val root = arrayOf(10,5,15,3,7,null,18)
        val L = 7
        val R = 15
        val verify = 32

        val result = rangeSumOfBST.rangeSumBST(genRootTree(root), L, R)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun rangeSumBST_Test02() {
        val root = arrayOf(10,5,15,3,7,13,18,1,null,6)
        val L = 6
        val R = 10
        val verify = 23

        val result = rangeSumOfBST.rangeSumBST(genRootTree(root), L, R)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun rangeSumBST_Test03() {
        val root = arrayOf(15,9,21,7,13,19,23,5,null,11,null,17)
        val L = 19
        val R = 21
        val verify = 40

        val result = rangeSumOfBST.rangeSumBST(genRootTree(root), L, R)

        Assert.assertEquals(result, verify)
    }

    fun genRootTree(root: Array<Int?>): RangeSumOfBST.TreeNode? {

        val nodeList = root.toMutableList()
        val rNode = RangeSumOfBST.TreeNode(nodeList.removeAt(0)!!)
        val queue = LinkedList<RangeSumOfBST.TreeNode>()
        queue.push(rNode)

        while (queue.isNotEmpty()) {
            val node = queue.pop()

            if(nodeList.isNotEmpty()) {
                val leftValue = nodeList.removeAt(0)
                if(leftValue != null) {
                    val leftNode = RangeSumOfBST.TreeNode(leftValue)
                    node.left = leftNode
                    queue.add(leftNode)
                }
            }

            if(nodeList.isNotEmpty()) {
                val rightValue = nodeList.removeAt(0)
                if(rightValue != null) {
                    val rightNode = RangeSumOfBST.TreeNode(rightValue)
                    node.right = rightNode
                    queue.add(rightNode)
                }
            }
        }

        return rNode
    }

}