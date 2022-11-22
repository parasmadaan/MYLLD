package SnakesNLadders.Model;

import java.util.UUID;

public class Player {
    private String name;
    private String id;

    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public Player(String name,String id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
