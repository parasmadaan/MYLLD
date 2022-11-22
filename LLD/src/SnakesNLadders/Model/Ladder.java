package SnakesNLadders.Model;

import SnakesNLadders.Model.GameObjects;

public class Ladder implements GameObjects {

    private int start;
    private int end;

    public Ladder(int start,int end){
     this.start = start;
     this.end = end;
    }

    @Override
    public int move() {
        return end;
    }

    @Override
    public int getStart() {
        return this.start;
    }

    @Override
    public int getEnd() {
        return end;
    }


}