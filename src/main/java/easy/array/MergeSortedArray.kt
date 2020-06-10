package easy.array

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var mIndex = m - 1
        var nIndex = n - 1

        var end = nums1.size - 1

        while (mIndex >= 0 || nIndex >= 0) {

            val n1 = if(mIndex >= 0) {
                nums1[mIndex]
            }else {
                Int.MIN_VALUE
            }

            val n2 = if(nIndex >= 0) {
                nums2[nIndex]
            } else {
                Int.MIN_VALUE
            }

            if(n2 > n1) {
                nums1[end] = n2
                nIndex--
            }
            else {
                val tmp = nums1[end]
                nums1[end] = nums1[mIndex]
                nums1[mIndex] = tmp
                mIndex--
            }

            end--
        }

    }

}