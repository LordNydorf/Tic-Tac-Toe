import kotlin.random.Random

fun placeComputerMove() {
    var i: Int
    var j: Int
    do {
        i = Random.nextInt(3)
        j = Random.nextInt(3)
    } while (board[i][j] != "")
    board[i][j] = "O"
}