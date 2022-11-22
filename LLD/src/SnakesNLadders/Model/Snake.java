package SnakesNLadders.Model;

import SnakesNLadders.Model.GameObjects;

public class Snake implements GameObjects {

    private int start;
    private int end;

    public Snake(int start,int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int move() {
        return start;
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
