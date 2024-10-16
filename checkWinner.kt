fun checkWinner(player: Boolean): Boolean {
    var won = false
    val checkSymbol: String = if (player) "X" else "O"
    for (i in 0..2) {
        //Horizontal Wins
        if (board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) {
            won = true
            break
        }

        //Vertical Wins
        if (board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol) {
            won = true
            break
        }

        //Diagonal Wins
        if (board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) {
            won = true
        }
        if (board[2][0] == checkSymbol && board[1][1] == checkSymbol && board[0][2] == checkSymbol) {
            won = true
        }
    }
    return won
}