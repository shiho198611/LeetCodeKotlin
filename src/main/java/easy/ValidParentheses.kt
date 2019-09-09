package easy

import java.util.*

class ValidParentheses {

    fun isValid(s: String): Boolean {

        val leftStack = Stack<Char>()

        for(index in s.indices) {
            if(s[index] == '(' || s[index] == '[' || s[index] == '{') {
                leftStack.push(s[index])
            }
            else {
                if(leftStack.empty()) {
                    return false
                }
                val left = leftStack.pop()
                if(s[index] == ')' && left != '(') {
                    return false
                }
                else if(s[index] == ']' && left != '[') {
                    return false
                }
                else if(s[index] == '}' && left != '{') {
                    return false
                }
            }
        }

        return leftStack.isEmpty()
    }

}