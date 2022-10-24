fun checkBalance(input:String) {
    var sInput = input
    while (sInput.length != 0) {
        sInput = sInput.replace("()","")
        sInput = sInput.replace("[]","")
        sInput = sInput.replace("{}", "")
    }
    if (sInput.length == 0) {
        print("YES")
    } else {
         print("NO")       
    }
}

fun main() {
    var input = "{[()]}"
    checkBalance(input)
}

