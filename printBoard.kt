fun printBoard() {
    println("-------------")
    for (i in 0..2) {
        for (j in 0..2){
            when (board[i][j]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}