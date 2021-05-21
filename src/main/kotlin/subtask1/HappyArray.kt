package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyList: MutableList<Int> = mutableListOf()

        for ((index, value) in sadArray.withIndex()){
            if (index == 0 || index == sadArray.size - 1){
                happyList.add(value)
                continue
            }
            val sum = sadArray[index - 1] + sadArray[index + 1]
            if (sum >= value){
                happyList.add(value)
            }

        }

        val happyArray = happyList.toIntArray()

        return if (happyArray contentEquals  sadArray) happyArray else convertToHappy(happyArray)
    }
}
