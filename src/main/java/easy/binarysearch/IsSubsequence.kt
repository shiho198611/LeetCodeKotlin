package easy.binarysearch

class IsSubsequence {

    fun isSubsequence(s: String, t: String): Boolean {

        if (s.isEmpty()) return true

        var sInx = 0
        for(char in t) {
            if(char == s[sInx]) sInx++
            if(sInx == s.length) return true
        }
        return false
    }

}