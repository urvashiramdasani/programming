fun main(args: Array<String>) {
    //var mySamsungGalaxy = SamsungGalaxy()
    var mySamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance
    mySamsungGalaxy.name = "Galaxy Note"
    println(mySamsungGalaxy.name)

    var yourSamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance
    println(yourSamsungGalaxy.name) // object created only once
}

class SamsungGalaxy {
    var name: String = "Galaxy S8"
    private constructor() {  // this is must
        println("$name is created")
    }
    companion object {
        val theOnlyGalaxyS8Instance: SamsungGalaxy by lazy {
            SamsungGalaxy()
        }
    }
}