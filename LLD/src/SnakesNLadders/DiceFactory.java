package SnakesNLadders;

import SnakesNLadders.Enums.DiceType;
import SnakesNLadders.Model.BaisedDice;
import SnakesNLadders.Model.Dice;
import SnakesNLadders.Model.UnbaisedDice;

import java.util.HashMap;

public class DiceFactory {

    UnbaisedDice unbaisedDice;
    BaisedDice baisedDice;

    public Dice getDiceInstance(String diceType){
        if(DiceType.BAISED.equals(diceType)){
            return unbaisedDice;
        }else if (DiceType.UNBAISED.equals(diceType)){
            return baisedDice;
        }else{
            throw new RuntimeException();
        }
    }
}
