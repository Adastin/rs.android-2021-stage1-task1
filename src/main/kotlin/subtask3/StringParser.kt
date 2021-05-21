package subtask3

class StringParser {
    private val bracketsMap = mapOf('[' to ']', '(' to ')', '<' to '>')

    fun getResult(inputString: String): Array<String> {
        val resultList: MutableList<String> = mutableListOf();
        var currentString = inputString
        while (currentString.isNotEmpty()){
            val startChar = currentString[0]
            if (bracketsMap.containsKey(startChar)){
                val closeChar = bracketsMap[startChar]
                var score = 0
                for ((index, value) in currentString.withIndex()){
                    when (value){
                        startChar -> score++
                        closeChar -> score--
                    }
                    if (score == 0) {
                        resultList.add(currentString.substring(1, index))
                        break
                    }
                }
            }
            currentString = currentString.substring(1)
        }
        return resultList.toTypedArray()
    }
}
