package easy.array

class NumberStudentsDoingHomeworkGivenTime {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {

        var result = 0

        for(i in startTime.indices) {
            if(queryTime >= startTime[i] && queryTime <= endTime[i]) {
                result ++
            }
        }

        return result
    }

}