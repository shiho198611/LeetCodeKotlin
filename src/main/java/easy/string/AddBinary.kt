package easy.string

class AddBinary {

    fun addBinary(a: String, b: String): String {

//        var longStr = a
//        var shortStr = b
//
//        if(b.length > a.length) {
//            longStr = b
//            shortStr = a
//        }
//
//        var next = '0'
//        val result = StringBuilder()
//
//        val range = longStr.length - shortStr.length
//
//        for(i in longStr.lastIndex downTo  0) {
//
//            val shortChar = if(i-range < 0) '0' else shortStr[i-range]
//
//            val sum1 = check(longStr[i], shortChar)
//            val sum2 = check(next, sum1[1])
//            if(sum1[0] == '1' || sum2[0] == '1') {
//                next = '1'
//            }
//            else {
//                next = '0'
//            }
//            result.append(sum2[1])
//        }
//
//        if(next == '1') {
//            result.append(next)
//        }
//
//        return result.reverse().toString()

//        println('0'.toInt())
//        println('1'.toInt())
//
//        println('0'.toInt() xor '1'.toInt() xor '0'.toInt())


        var aInx = a.lastIndex
        var bInx = b.lastIndex



        return ""
    }

    fun check(a: Char, b: Char): String {
        if(a == '0' && b == '0') {
            return "00"
        }
        else if(a == '0' && b == '1') {
            return "01"
        }
        else if(a == '1' && b == '0') {
            return "01"
        }
        else {
            return "10"
        }
    }

}