fun checkBoardFull(): Boolean {
    var boardFull = true
    for (i in 0..2){
        for(j in 0..2){
            if(board[i][j] == "") {
                boardFull = false
                break
            }
        }
    }
    return boardFull
}