package dicegame.players;

import java.util.Random;

public class PlayerComp extends Player {

//  Deklaracja zmiennych
    private final Random guess = new Random();

    /*
    Kontruktory
     */
    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name);
    }

//  Metoda odgadująca liczbę dla komputera
    @Override
    public int guess() {
        return guess.nextInt(6) + 1;
    }
}
