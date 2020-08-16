fun main(args: Array<String>) {
    var myComputer: Computer = Nexus()
    println(myComputer.computerName)

    var myNexus: Nexus = Computer() as Nexus // down casting
}

open class Computer {
    var computerName: String = "Nexus"
}

class Nexus: Computer() {

}