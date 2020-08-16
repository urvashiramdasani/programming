fun main(args: Array<String>) {
    //var employee = Employee()
    //employee.name = "Someone"
    
    var myPerson = Person()
    myPerson.name = "Aaron"
    println(myPerson.name)

    var myStudent = Student()
    myStudent.name = "Mark"
    println(myStudent.name)
    myStudent.studentID = 1234567
    println(myStudent.studentID!!)
}

open class Person() { // by default all are final
    var name: String? = null
    var age: Int? = null
    var height: Int? = null
}

class Student() : Person() {
    var studentID: Int? = null
}

class Employee() : Person() {
    var employeeID: Int? = null
}