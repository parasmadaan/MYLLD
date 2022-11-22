package SnakesNLadders.Model;

import java.util.Random;

public class UnbaisedDice implements Dice{

private int size;

    public UnbaisedDice(int size){
        this.size = size;
    }

    @Override
    public int roll() {
        return new Random().nextInt(size)+1;
    }
}
