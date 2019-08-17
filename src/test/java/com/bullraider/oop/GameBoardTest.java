package com.bullraider.oop;

import com.bullraider.oop.board.GameBoard;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameBoardTest {

    @Test
    public void WhenThereIsNoSnakeOrLadder_ShouldIncreamentTotheSquare() {
        GameBoard gameBoard = new GameBoard();
        Player player = new Player("Player 1", gameBoard);

        int move = gameBoard.move(player, 5);
        assertEquals(5, move);
    }

    @Test
    public void WhenThereIsSnake_ShouldDecreamentTotheSquare() {
        GameBoard gameBoard = new GameBoard();
        Player player = new Player("Player 1", gameBoard);

        int move = gameBoard.move(player, 5);
        assertEquals(5, move);
    }

    @Test
    public void WhenThereIsLadder_ShouldIncreamentTotheSquare() {
        GameBoard gameBoard = new GameBoard();
        Player player = new Player("Player 1", gameBoard);

        int move = gameBoard.move(player, 2);
        assertEquals(38, move);
    }

//    @Test
//    public void WhenThereIsLadder_ShouldIncreamentTotheSquare() {
//        GameBoard gameBoard = new GameBoard();
//        Player player = new Player("Player 1", gameBoard);
//
//        int move = gameBoard.move(player, 5);
//        assertEquals(5, move);
//    }
}