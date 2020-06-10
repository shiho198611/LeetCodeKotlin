package easy.hashtable

class IntersectionOfTwoArrays2 {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

        var longArray = nums1
        var shortArray = nums2

        if(nums1.size < nums2.size) {
            longArray = nums2
            shortArray = nums1
        }

        longArray.sort()
        shortArray.sort()

        val rList = mutableListOf<Int>()

        var sIndex = 0
        var lIndex = 0

        while (sIndex < shortArray.size && lIndex < longArray.size) {

            if(shortArray[sIndex] > longArray[lIndex]) {
                lIndex ++
            }
            else if(shortArray[sIndex] < longArray[lIndex]) {
                sIndex ++
            }
            else {
                rList.add(shortArray[sIndex])
                sIndex ++
                lIndex ++
            }

        }

        return rList.toIntArray()

    }

}