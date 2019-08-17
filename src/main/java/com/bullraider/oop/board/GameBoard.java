package com.bullraider.oop.board;

import com.bullraider.oop.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GameBoard {


    private List<Jumps> jumps;

    public GameBoard() {
        this.jumps = new ArrayList<Jumps>();
        buildLadder();
        buildSnakes();
    }

    private void buildSnakes() {
        jumps.add(new Snake(16, 6));
        jumps.add(new Snake(46, 25));
        jumps.add(new Snake(49, 11));
        jumps.add(new Snake(62, 19));
        jumps.add(new Snake(64, 60));
        jumps.add(new Snake(74, 53));
        jumps.add(new Snake(89, 68));
        jumps.add(new Snake(92, 88));
        jumps.add(new Snake(99, 80));
    }

    private void buildLadder() {
        jumps.add(new Ladder(2, 38));
        jumps.add(new Ladder(7, 14));
        jumps.add(new Ladder(8, 31));
        jumps.add(new Ladder(15, 26));
        jumps.add(new Ladder(21, 42));
        jumps.add(new Ladder(28, 84));
        jumps.add(new Ladder(36, 44));
        jumps.add(new Ladder(51, 67));
        jumps.add(new Ladder(71, 91));
        jumps.add(new Ladder(78, 98));
        jumps.add(new Ladder(87, 94));
    }

    public List<Jumps> getJumps() {
        return Collections.unmodifiableList(jumps);
    }

    public int move(Player player, int moveCount) {
        int currentSquare = player.getCurrentSquare();
        int nextSquare = currentSquare + moveCount;
        int i = IsHitBySnakeOrLadder(nextSquare);
        if(i>100){
           return IsHitBySnakeOrLadder(100-(i-100));
        }else{
           return IsHitBySnakeOrLadder(i);
        }
    }

    private int IsHitBySnakeOrLadder(int nextSquare) {
        return strategy(nextSquare) == 0 ? nextSquare :
                strategy(nextSquare);
    }

    private int strategy(int nextSquare) {
        for (int i = 0; i < jumps.size(); i++) {
            if (jumps.get(i).getFrom()==nextSquare){
                return jumps.get(i).moveTo(nextSquare);
            }
        }
        return 0;
    }



}
