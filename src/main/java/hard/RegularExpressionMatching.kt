package hard

class RegularExpressionMatching {

    fun isMatch(s: String, p: String): Boolean {

        var useStr = s

        if(p.length < s.length) {
            return false
        }
        else if(p.length > s.length) {
            for(i in 0..p.length - s.length) {
                useStr += ' '
            }
        }

        var result = s.length
        var lastChar = ' '

        var pIndex = 0
        var sIndex = 0

        while (pIndex < p.length && sIndex < useStr.length) {

            if(p[pIndex] != '*') {
                lastChar = p[pIndex]
            }

            println("last: "+lastChar+", "+sIndex+", "+pIndex)

            if(useStr[sIndex] == p[pIndex] || p[pIndex] == '.') {
                result --
                pIndex ++
                sIndex ++
            }
            else {
                if(p[pIndex] == '*') {
                    if(lastChar == '.') {
                        result--
                        sIndex++
                    }
                    else {
                        if(lastChar == s[sIndex]) {
                            println("gate01: "+lastChar)
                            result--
                            sIndex++
                            pIndex = sIndex
                        }
                        else {
                            println("gate02: "+lastChar)
                            result --
                            pIndex ++

//                            println(""+sIndex+", "+pIndex)
                        }
                    }
                }
                else {
                    // a-z character
                    pIndex ++
                    result ++
                }
            }

        }

        println(result)


//        if(result == 0) {
//            if(s.length == sIndex && s.length == p.length) {
//                return true
//            }
//            else if(s.length == sIndex && s.length < p.length) {
//                return false
//            }
//        }
//        else {
//            return false
//        }
//
//
//        return false



        return result == 0
    }

}