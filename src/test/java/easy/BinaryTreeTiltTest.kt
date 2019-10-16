package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class BinaryTreeTiltTest {

    lateinit var binaryTreeTilt: BinaryTreeTilt

    @Before
    fun initTest() {
        binaryTreeTilt = BinaryTreeTilt()
    }

    @Test
    fun binaryTreeTilt_Test01() {
        val input = arrayOf("1", "2", "3")
        val root = array2TreeNode(input.toMutableList())
        val verify = 1

        val result = binaryTreeTilt.findTilt(root)

        Assert.assertEquals(result, verify)
    }


    @Test
    fun binaryTreeTilt_Test02() {
        val input = arrayOf("1", "2", null, "3")
        val root = array2TreeNode(input.toMutableList())
        val verify = 8

        val result = binaryTreeTilt.findTilt(root)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun binaryTreeTilt_Test03() {
        val input = arrayOf(1,2,3,4,5,6,7).map { it.toString() }
        val root = array2TreeNode(input.toMutableList())
        val verify = 7

        val result = binaryTreeTilt.findTilt(root)

        Assert.assertEquals(result, verify)
    }


    fun array2TreeNode(input: MutableList<String?>): BinaryTreeTilt.TreeNode? {
        if(input.isEmpty()) {
            return null
        }
        else {
            val queue = LinkedList<BinaryTreeTilt.TreeNode?>()
            val value = input.removeAt(0)
            val root = BinaryTreeTilt.TreeNode(value!!.toInt())

            queue.add(root)

            while (queue.isNotEmpty() && input.isNotEmpty()) {
                val node = queue.pop()

                var lv: String? = null
                if(input.isNotEmpty()) {
                    lv = input.removeAt(0)
                }

                var rv: String? = null

                if(input.isNotEmpty()) {
                    rv = input.removeAt(0)
                }

                if(lv != null) {
                    node?.left = BinaryTreeTilt.TreeNode(lv.toInt())
                    queue.add(node?.left)
                }
                if(rv != null) {
                    node?.right = BinaryTreeTilt.TreeNode(rv.toInt())
                    queue.add(node?.right)
                }
            }

            return root
        }
    }

}