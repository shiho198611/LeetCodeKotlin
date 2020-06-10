package easy.hashtable

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {

        var result = true

        if(s.length != t.length) {
            return false
        }
        else {

            val sArray = IntArray(26){0}
            val tArray = IntArray(26){0}

            for (index in s.indices) {
                sArray[s[index].toInt() - 97] ++
                tArray[t[index].toInt() - 97] ++
            }

            run loop@ {
                for (index in sArray.indices) {
                    if(sArray[index] != tArray[index]) {
                        result = false
                        return@loop
                    }
                }
            }

            return result
        }

    }

}