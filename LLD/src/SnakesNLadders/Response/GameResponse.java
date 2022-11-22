package SnakesNLadders.Response;

import SnakesNLadders.Enums.GameStatus;

public class GameResponse {
    GameStatus status;

    String playerWon;
    String message;

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public String getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(String playerWon) {
        this.playerWon = playerWon;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GameResponse(GameStatus status, String playerWon, String message) {
        this.status = status;
        this.playerWon = playerWon;
        this.message = message;
    }

}
