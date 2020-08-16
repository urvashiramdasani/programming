fun main(args: Array<String>) {
    println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feel.GOOD)
}

enum class GameStatus {
    WON, LOSS
}

enum class Feel {
    GOOD,
    BAD
}