package a2.projekt;

import java.util.Random;

public class Player {

    public Player(String name) {
//      this.name = name;
        setName(name);
    }

    public Player() {
        this.name = "Player";
    }

    private String name = "Gracz";

//  "odgadywacz"
    private Random guess = new Random();

//  metoda odgadująca liczbę
    public int guess() {
        return guess.nextInt(6) + 1;
    }

//  seter/getter
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else{
            System.err.println("Blad, zle wproawdzone dane!");
        }
    }

    public String getName() {
        return name;
    }

}
