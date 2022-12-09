package easy.dp

class PascalTriangle2 {

    fun getRow(rowIndex: Int): List<Int> {

        var result = mutableListOf<Int>()

        for (i in 0..rowIndex) {
            if (i == 0) {
                result.add(1)
            } else if (i == 1) {
                result.add(1)
            } else {
                val item = mutableListOf(1, 1)
                for (j in 1 until i) {
                    item.add(j, result[j - 1] + result[j])
                }

                result = item
            }
        }

        return result
    }

}