package easy.hashtable

class JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        val map = Array(123){false}
        for(it in J) {
            map[it.toInt()] = true
        }
        return S.filter { map[it.toInt()] }.length
    }
}