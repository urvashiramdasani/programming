fun main(args: Array<String>) {
    var myAnimal = Animal()
    myAnimal.fight()

    var myTiger = Tiger()
    myTiger.fight()
}

open class Animal {
    var name: String = ""
    open fun fight() {
        println("The animal is fighting")
    }
}

class Tiger: Animal() {
    override fun fight() {
        //super.fight()
        println("Fight Harder...")
    }
}