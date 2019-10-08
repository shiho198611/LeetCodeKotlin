package easy

class MinStack {

    val mStack = mutableListOf<Int>()
    val minStack = mutableListOf(Int.MAX_VALUE)

    fun push(x: Int) {
        mStack.add(x)
        if(x <= minStack[minStack.lastIndex]) {
            minStack.add(x)
        }
    }

    fun pop() {
        val popIt = mStack.removeAt(mStack.lastIndex)
        if(popIt == minStack[minStack.lastIndex]) {
            minStack.removeAt(minStack.lastIndex)
        }
    }

    fun top(): Int {
        return mStack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }

}