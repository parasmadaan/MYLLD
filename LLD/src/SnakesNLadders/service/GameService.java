package SnakesNLadders.service;

import SnakesNLadders.Board.GameBoard;
import SnakesNLadders.Enums.GameStatus;
import SnakesNLadders.Model.Dice;
import SnakesNLadders.Model.Player;
import SnakesNLadders.Response.GameResponse;

import java.util.List;

public class GameService {
    private GameBoard gameBoard;
    GameStatus gameStatus;
    Dice dice;

    public GameService(GameBoard gameBoard){
        this.gameBoard = gameBoard;
        gameStatus = GameStatus.STARTING;
    }


    public static void main(String[] args) {
        Player player1 = new Player("Paras");
        Player player2 = new Player("Abhishek");
    }
}
