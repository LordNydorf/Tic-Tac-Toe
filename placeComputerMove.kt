package com.home.tictactoe

import kotlin.random.Random

fun placeComputerMove() {
    var i = 0
    var j = 0
    do {
        i = Random.nextInt(3)
        j = Random.nextInt(3)
    } while (board[i][j] != "")
    board[i][j] = "O"
}