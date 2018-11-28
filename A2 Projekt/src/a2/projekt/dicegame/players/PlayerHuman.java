package dicegame.players;

import java.util.Scanner;

public class PlayerHuman extends Player {
//  Deklaracja zmiennych

    private final Scanner in = new Scanner(System.in);

    /*
    Kontruktory
     */
    public PlayerHuman(String name) {
        super(name);    //Odwołanie się do konstruktora klasy wyżej - super 
    }

    public PlayerHuman() {
    }

//  Metoda odgadująca dla człowieka
    @Override
    public int guess() {
        return in.nextInt();
    }
}
