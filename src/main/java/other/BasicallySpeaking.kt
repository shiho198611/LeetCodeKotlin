package other

import java.lang.StringBuilder
import java.util.*
/**
 * Problem from UVa No.389
 * */
class BasicallySpeaking {

    fun speaking(input: String): String {

        val inputInfo = input.split(" ")
        val resultStack = Stack<String>()

        var keyInput = inputInfo[0]
        if(keyInput.length > 7) {
            keyInput = keyInput.substring((keyInput.length - 7)..7)
        }

        val change = Integer.parseInt(keyInput, inputInfo[1].toInt())

        var sum = change
        val base = inputInfo[2].toInt()

        while (resultStack.size < 7) {
            if(sum != 0) {

                val digit = sum % base
                if(digit > 9) {
                    resultStack.add(Integer.toHexString(digit).toUpperCase())
                }
                else {
                    resultStack.add(digit.toString())
                }

                sum /= base
            }
            else {
                resultStack.add("0")
            }
        }

        val result = StringBuilder()
        while (resultStack.isNotEmpty()) {
            result.append(resultStack.pop())
        }

        return result.toString()
    }

}