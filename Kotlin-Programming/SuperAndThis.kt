fun main(args: Array<String>) {
    var myKickBoxer: KickBoxer = KickBoxer(200,400,10)
    println(myKickBoxer.kickPower)
    println(myKickBoxer.kickSpeed)
    //println(myKickBoxer.numberOfMatchesWon) // error
    myKickBoxer.fight()
}

open class Boxer(numberOfMatchesWon: Int) {
    var name: String = ""
    var punchSpeed: Int = 0
    var punchPower: Int = 0

    fun throwPunch() {
        println("The Boxer is throwing a punch")
    }
}

class KickBoxer: Boxer { // parenthesis deleted, constructor used
    var kickSpeed: Int = 0
    var kickPower: Int = 0
    fun fight() {
        super.throwPunch()
        println("The kickboxer is fighting")
    }

    constructor(kickSpeed: Int,kickPower:Int,numberOfMatchesWon: Int): super(numberOfMatchesWon) {
        this.kickSpeed = kickSpeed
        this.kickPower = kickPower
        println(numberOfMatchesWon)
    }
}