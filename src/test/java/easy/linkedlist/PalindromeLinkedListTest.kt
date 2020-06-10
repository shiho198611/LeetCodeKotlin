package easy.linkedlist

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PalindromeLinkedListTest : BaseLinkedListTest() {

    lateinit var palindromeLinkedList: PalindromeLinkedList

    @Before
    fun initTest() {
        palindromeLinkedList = PalindromeLinkedList()
    }

    @Test
    fun isPalindrome_Test01() {
        val head = transfer2ReverseLinkedList(mutableListOf(1, 2))
        val result = palindromeLinkedList.isPalindrome(head)

        Assert.assertFalse(result)
    }

    @Test
    fun isPalindrome_Test02() {
        val head = transfer2ReverseLinkedList(mutableListOf(1, 2, 2, 1))
        val result = palindromeLinkedList.isPalindrome(head)

        Assert.assertTrue(result)
    }

    @Test
    fun isPalindrome_Test03() {
        val head = transfer2ReverseLinkedList(mutableListOf(1, 1, 2, 1))
        val result = palindromeLinkedList.isPalindrome(head)

        Assert.assertFalse(result)
    }

}