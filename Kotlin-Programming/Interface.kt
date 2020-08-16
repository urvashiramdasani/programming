fun main(args: Array<String>) {
    var myNexus = NexusClass() 
    println(myNexus.getName()+" - "+myNexus.getRam()+" - "+myNexus.getCPUType())

    var myIPhone = IPhoneClass()
    println(myIPhone.getName()+" - "+myIPhone.getRam()+" - "+myIPhone.getCPUType)
}

interface ComputerInterface {
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String
}

class NexusClass: ComputerInterface {
    override fun getName(): String {
        return "Nexus 6"
    }
    override fun getRam(): Int {
        return 1000
    }
    override fun getCPUType(): String {
        return "Snapdragon"
    }
}

class IPhoneClass: ComputerInterface {
    override fun getName(): String {
        return "iPhone 7"
    }
    override fun getRam(): Int {
        return 3000
    }
    override fun getCPUType(): String {
        return "A5"
    }
}