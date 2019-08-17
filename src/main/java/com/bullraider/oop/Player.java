package com.bullraider.oop;

import com.bullraider.oop.board.GameBoard;

public class Player {
    private final GameBoard gameBoard;
    private String name;
    private String status;
    private int currentSquare;

    public Player(String name, GameBoard gameBoard) {
        this.name = name;
        this.gameBoard=gameBoard;
    }

    public int getCurrentSquare() {
        return this.currentSquare;
    }


    public int move(Die die1, Die die2) {

        int i = die1.addDice(die2);
        int move = gameBoard.move(this, i);
        this.currentSquare=move;
        return move;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public void setCurrentSquare(int i) {
        this.currentSquare=i;
    }
}
