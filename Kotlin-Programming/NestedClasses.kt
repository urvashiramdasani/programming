fun main(args: Array<String>) {
    var outerAnimal = OuterAnimalClass()
    var nestedLion = OuterAnimalClass.StaticLionClass()
    var innerTiger = OuterAnimalClass().NonStaticTigerClass() // first call outer class constructor
    // since inner class is non static
    innerTiger.printAnimalName()
}

class OuterAnimalClass {
    private var animalName: String = "Some name"
    class StaticLionClass { // no inner means static class
        fun printAnimalName() {
            //println(animalName)
        }
    }
    inner class NonStaticTigerClass {
        fun printAnimalName() {
            println(animalName)
        }
    }
}