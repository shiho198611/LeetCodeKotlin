package easy.binarysearch

class SqrtX {

    fun mySqrt(x: Int): Int {

//        for(i in 1..65536) {
//            if(i*i == x) {
//                return i
//            }
//            else if(i.toLong()*i.toLong() > x) {
//                return (i-1)
//            }
//        }

//        println(Math.sqrt(Int.MAX_VALUE.toDouble()))

//        return Math.sqrt(x.toDouble()).toInt()
        return Math.pow(x.toDouble(), 2.0).toInt()
    }

}