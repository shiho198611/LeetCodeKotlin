package easy

class IsomorphicStrings {

    fun isIsomorphic(s: String, t: String): Boolean {

        val mark = IntArray(258)

        for (index in s.indices) {

            val sIndex = s[index].toInt()
            val tIndex = t[index].toInt()

            if(mark[sIndex] != mark[tIndex+126]) {
                return false
            }
            else {
                mark[sIndex] = index+1
                mark[tIndex+126] = index+1
            }
        }

        return true

    }

}