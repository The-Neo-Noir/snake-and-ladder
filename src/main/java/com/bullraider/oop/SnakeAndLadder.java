package com.bullraider.oop;

import com.bullraider.oop.board.GameBoard;

public class SnakeAndLadder {

       private GameBoard gameBoard;
       private  Player [] players;
       private int totalMoves=0;
       private boolean gameOver=false;

    public SnakeAndLadder() {
        initOrReset();
    }

    private void initOrReset() {
        gameBoard = new GameBoard();
        players = new Player[2];
        players[0] = new Player("Player 1",gameBoard);
        players[1] = new Player("Player 2",gameBoard);
        totalMoves=0;
    }

    public Player[]  getPlayers() {
        return this.players;
    }

    public Player getCurrentTurn() {
        return players[totalMoves % players.length];
    }

    public String play(int die1, int die2) {
        if(gameOver){
            return "Game over!";
        }
        Die dice1 = new Die(die1);
        Die dice2 = new Die(die2);
        if (dice1.equals(dice2)) {
            Player currentTurn = getCurrentTurn();
            int move = currentTurn.move(dice1, dice2);
           return displayWins( currentTurn,move);

        }else{
            Player currentTurnPlayer = getCurrentTurn();
            int move = currentTurnPlayer.move(dice1, dice2);
            String result=displayWins( currentTurnPlayer,move);
            totalMoves++;
            return result;
        }
    }
    private String displayWins(Player player,int move){
        String status="";
            if(move==100){
                status=player.toString()+" Wins!";
                initOrReset();
                gameOver=true;
            }else{
                status = player.toString()+" is on square " + player.getCurrentSquare();
            }
        return status;
    }


    public GameBoard getGameBoard() {
        return this.gameBoard;
    }

    public void setCurrentTurn(int turn) {
        totalMoves=turn;

    }
}
