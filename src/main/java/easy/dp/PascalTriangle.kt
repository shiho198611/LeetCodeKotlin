package easy.dp

class PascalTriangle {

    fun generate(numRows: Int): List<List<Int>> {

        val result = mutableListOf<List<Int>>()

        for (i in 1..numRows) {
            if (i == 1) {
                result.add(listOf(1))
            } else if (i == 2) {
                result.add(listOf(1, 1))
            } else {
                val previous = result.last()
                val item = mutableListOf(1, 1)
                for(j in 1..i-2) {
                    item.add(j, previous[j-1]+previous[j])
                }
                result.add(item)
            }
        }

        return result
    }

}