fun getMaxNumberCount(input:List<Int>) : Int {
    val resultArr = arrayListOf<Int>()
    var index = 0
    var maxCount = 0
    var count = 1
    for (item in input) {
        if (index+1 != input.size && input[index] == input[index+1]) {
            count++
        } else {
            resultArr.add(count)
            if (count > maxCount) {
                maxCount = count
            }
            count = 1
        }
        index++
    }
    return maxCount
}

fun checkInput(input:List<Int>) : Boolean {
    var isValid = true
    if (input.size <= 0 || input.size > 10000) {
        isValid = false
    } else {
        for (item in input) {
        	if (item != 0 && item != 1) {
                isValid = false
            }
    	}   
    }
    
    return isValid
}

fun main() {
    val input = listOf(1,0,0,0,1,1,0)
    
    if (checkInput(input)) {
        print(getMaxNumberCount(input))     
    } else {
        print("Your input is Invalid")
    }
   
}
