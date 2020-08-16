fun main(args: Array<String>) {
    var myAnimal = GenericAnimalClass("Lion")
    var myAnimal2 = GenericAnimalClass(true)
    var myAnimal3 = GenericAnimalClass(20)
}

class GenericAnimalClass<T>(kind: T) {
    init {
        println(kind)
    }
}