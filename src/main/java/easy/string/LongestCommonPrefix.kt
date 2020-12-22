package easy.string
/**
 * Special Problem
 */
class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]

        var index = -1
        run loop@{
            strs[0].forEachIndexed { i, c ->
                for (j in 1..strs.lastIndex) {

                    if (i < strs[j].length) {
                        if (strs[j][i] == c) {
                            index = i
                        } else {
                            if (index == i) {
                                index--
                            }
                            return@loop
                        }
                    } else {
                        if (index == i) {
                            index--
                        }
                        return@loop
                    }
                }
            }
        }

        if (index == -1) {
            return ""
        } else {

            val result = StringBuilder()

            for (i in 0..index) {
                result.append(strs[0][i])
            }

            return result.toString()
        }

    }

}