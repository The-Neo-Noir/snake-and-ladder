package com.bullraider.oop.board;

public abstract class Jumps {

    private final int from;
    private final int to;

    public Jumps(int from, int to) {
        this.from=from;
        this.to=to;
    }

    public int moveTo(int currentSqure){
        return to;
    }



    public int getFrom() {
        return this.from;
    }

    public  int getTo(){
        return this.to;
    }
}
