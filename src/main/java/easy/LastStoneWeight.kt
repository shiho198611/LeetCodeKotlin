package easy

class LastStoneWeight {

    fun lastStoneWeight(stones: IntArray): Int {

        val list = stones.toMutableList()

        while (list.size > 1) {

            val max1 = list.max()?: 0
            list.remove(max1)

            val max2 = list.max()?: 0
            list.remove(max2)

            list.add(max1 - max2)
        }

        return list[0]
    }

}