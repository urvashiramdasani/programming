fun main(args: Array<String>) {
    var animal = Animal(1000)
    var animal2 = Animal("My Lion", "Yellow",2000,3000)
}

class Animal(power: Int) {
    init {
        println(power)
    }
    constructor(name: String, color: String, speed: Int, power: Int): this(power) {
        println(name+" - "+color+" - "+power+" - "+speed)
    }
}