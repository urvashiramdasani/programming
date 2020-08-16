fun main(args: Array<String>) {

    // var myPlaceHolder: String = "My Value"
    // print(myPlaceHolder)
    // myPlaceHolder = "Another Value"
    // print(myPlaceHolder)

    // var myNumber = 20
    // print(myNumber)

    // val myConstant = "Fixed Value"
    // print(myConstant)
    // //myConstant = "another value"
    // //print(myConstant)

    // var myVariable: String ?
    // myVariable = null // null means invalid
    // println(myVariable)

    // //var anotherVariable: String
    // //anotherVariable = null

    // val myConstant1: Int ? 
    // myConstant1 = null

    // var age = 10
    // print("This is the age value: "+age)

    // print("Enter the Age: ")
    // var Age = readLine()
    // print("This is the age : "+Age)

    // print("Enter name : ")
    // var name = readLine()
    // print(name)

    print("Enter a number: ")
    var myNumber1: Int = readLine()!!.toInt() // unsafe
    print(myNumber1)

    var myDecimalNumber: Float = 2.5f
    var myPreciseDecimalNumber: Double = 2.12345678905454321212444
    print(myPreciseDecimalNumber)

    //var myIntegerNumber: Int? = null // shows error
    //myIntegerNumber = 20
    //print(myIntegerNumber!!)
}