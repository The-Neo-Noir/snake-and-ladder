package com.bullraider.oop;

import com.bullraider.oop.board.GameBoard;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeAndLadderTest {

    @Test
    public void getPlayers_shouldReturnTwoPlayer() {
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        Player[] players = snakeAndLadder.getPlayers();
        assertEquals(2, players.length);
    }

    @Test
    public void WhenInitialized_FirstPlayerShouldbeInTurn() {

        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        GameBoard gameBoard = snakeAndLadder.getGameBoard();
        assertEquals(new Player("Player 1", gameBoard), snakeAndLadder.getCurrentTurn());
    }

    @Test
    public void whenBothTheDieIsSame_SamePlayerPlaysAgain() {

        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        GameBoard gameBoard = snakeAndLadder.getGameBoard();

        String play = snakeAndLadder.play(1, 1);
        assertEquals(new Player("Player 1", gameBoard), snakeAndLadder.getCurrentTurn());
        assertEquals("Player 1 is on square 0",play);

    }
//    @Test
//    public void whenBothTheDieIsDiffernt_OtherPlayerPlays() {
//
//        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
//        String play = snakeAndLadder.play(1, 2);
//        GameBoard gameBoard = snakeAndLadder.getGameBoard();
//
//        //assertEquals(new Player("Player 1", gameBoard), );
//        assertEquals("Player 1 is on square 3",play);
//
//    }

    @Test
    public void whenBothTheDieIsDiffernt_OtherPlayerPlays() {


        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        String play = snakeAndLadder.play(1, 2);
        GameBoard gameBoard = snakeAndLadder.getGameBoard();

        //assertEquals(new Player("Player 1", gameBoard), );
        assertEquals("Player 1 is on square 3",play);

    }

    @Test
    public void Player2Wins() {
        double sqrt = Math.sqrt(13);
        int pow =(int) Math.pow(Math.round(Math.sqrt(13)), 2);
        System.out.println(pow);

        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        snakeAndLadder.getPlayers()[0].setCurrentSquare(84);
        snakeAndLadder.getPlayers()[1].setCurrentSquare(97);
        snakeAndLadder.setCurrentTurn(37);
        String play = snakeAndLadder.play(1, 2);
        GameBoard gameBoard = snakeAndLadder.getGameBoard();

        //assertEquals(new Player("Player 1", gameBoard), );
        assertEquals("Player 2 Wins!",play);

    }
}