fun reverseString(currentIndex:Int, input:List<String>) {
    print(" ${input[currentIndex]} ")
    if (currentIndex-1 > 0) {
      reverseString(currentIndex-1, input)   
    } else {
    print(" ${input[currentIndex-1]} ")
    }
}

fun main() {
    var input = listOf("h","e","l","o")
    reverseString(input.size-1, input)
}

