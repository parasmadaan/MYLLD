package SnakesNLadders.Model;

import java.util.Random;

public class BaisedDice implements Dice{

    private int size;

    public BaisedDice(int size){
        this.size = size;
    }

    @Override
    public int roll() {
        int number = new Random().nextInt(size/2);
        return number*2+2;
    }
}
