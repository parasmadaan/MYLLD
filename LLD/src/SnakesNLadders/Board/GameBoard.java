package SnakesNLadders.Board;

import SnakesNLadders.DiceFactory;
import SnakesNLadders.Enums.DiceType;
import SnakesNLadders.Enums.GameStatus;
import SnakesNLadders.Model.Dice;
import SnakesNLadders.Model.GameObjects;
import SnakesNLadders.Model.Player;
import SnakesNLadders.Response.GameResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    int size;

    Dice dice;

    Map<String,Integer> playersPosition;
    Queue<Player> playersQueue;
    List<GameObjects> snakeAndLadders;


    public GameBoard(int size,List<GameObjects> snakeAndLadders,Map<String,Integer> playersPosition,Queue<Player> players){
        this.size = size;
        this.playersPosition = playersPosition;
        playersQueue = players;
        dice = new DiceFactory().getDiceInstance(DiceType.BAISED.name());
        this.snakeAndLadders = snakeAndLadders;
    }

    public GameResponse playTurn(){
       Player currentPlayer = playersQueue.poll();
       int diceValue = dice.roll();
       int playerNewPosition = playersPosition.get(currentPlayer.getId())+diceValue;
       for(GameObjects snakeOrLadder : snakeAndLadders){
           if(snakeOrLadder.getStart() == playerNewPosition) {
               playerNewPosition = snakeOrLadder.move();
               break;
           }
       }
       if(playerNewPosition ==  100){
          return new GameResponse(GameStatus.COMPLETED,currentPlayer.getId(),currentPlayer.getId() +"WON");

       }
       playersQueue.add(currentPlayer);
        return new GameResponse(GameStatus.RUNNING,null,"Game Running");
    }

}



