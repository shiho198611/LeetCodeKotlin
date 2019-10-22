package easy

class FirstUniqueCharacterInString {

    fun firstUniqChar(s: String): Int {
        val table = Array(123){0}
        for(item in s) {
            table[item.toInt()] += 1
        }
        for(index in s.indices) {
            if(table[s[index].toInt()] == 1) {
                return index
            }
        }
        return -1
    }

}