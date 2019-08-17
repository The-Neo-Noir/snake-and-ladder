package com.bullraider.oop;


import com.bullraider.oop.board.GameBoard;
import com.bullraider.oop.board.Jumps;
import com.bullraider.oop.board.Ladder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GameBoard_LadderAndSnakes {

    static GameBoard board;

    @Parameterized.Parameters
    public static Collection parameter() {
        board = new GameBoard();
        return board.getJumps();

    }

    private int input;
    private int output;

    public GameBoard_LadderAndSnakes(Jumps ladder) {
        this.input = ladder.getFrom();
        this.output = ladder.getTo();
    }

    @Test
    public void whenLadder_ShouldEndupInRightSquqre() {
        int move = board.move(new Player("Player 1", board), input);

        assertEquals(output, move);
    }
}
