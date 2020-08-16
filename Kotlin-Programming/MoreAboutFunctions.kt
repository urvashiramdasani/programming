fun main(args: Array<String>) {
    subtract(10,5)
    subtract() // default value
}

fun subtract(firstNumber: Int = 20, secondNumber: Int = 5): Unit { //no return type
    println(firstNumber - secondNumber)
}