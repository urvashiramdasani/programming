fun main(args: Array<String>) {

    var car: MyCar = MyCar()
    car.speed = 200
    println(car.speed)

    var yourCar = MyCar()
    yourCar.power = 1000
    println(yourCar.power)
    println(yourCar.speed)
    println(MyCar().numberOfWheels)

}

class MyCar {
    var speed: Int = 0 // must be initialized
    var power: Int = 0
    var name: String = ""
    var numberOfWheels: Int = 0
}