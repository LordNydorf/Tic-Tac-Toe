var board = arrayListOf<ArrayList<String>>()

fun main() {
    for (i in 0..2){
        val row = arrayListOf<String>()
        for(j in 0..2)
            row.add("")
        board.add(row)
    }
    printBoard()

    var continueGame = true
    do{
        println("Please enter a position (e.g. 1, 1): ")
        val input = readlnOrNull() ?:""
        var x: Int
        var y: Int
        try{
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()
            var skipRound = false
            if (board[x-1][y-1] != ""){
                println("Position already taken, please try again")
                skipRound = true
            } else {
                board[x-1][y-1] = "X"
                printBoard()
            }
            if(!skipRound) {
                val playerWon = checkWinner(true)
                if (playerWon) {
                    println("👍👍🎉Congratulations🎉👍👍")
                    println("You won!")
                    continueGame = false
                }
                val boardFull = checkBoardFull()
                if (!playerWon && boardFull) {
                    println("It's a tie!")
                    continueGame = false
                }
                if (continueGame) {
                    placeComputerMove()
                    printBoard()
                    val computerWon = checkWinner(false)
                    if (computerWon) {
                        println("Computer Won")
                        continueGame = false
                    }
                }
            }
        }catch (e: Exception) {
            println("Invalid input, please try again")
        }
    }while (continueGame)
}