package a2.projekt;

import java.util.Random;

public class Game {

    protected Player player;
    protected Random cube = new Random();
    
    public void addPlayer(Player player) {
        this.player=player;
    }

    void play() {

//      Wylosowanie liczb
        int los = cube.nextInt(6) + 1;
        int choose;

//      Pętla sprawdzająca
        do {
            choose = player.guess();

            System.out.println(player.getName() + " wybrał " + choose);

//      Warunki sprawdzajace
            if (choose > 6) {
                System.out.println("Kostka ma co najwyżej 6 oczek!");
            }
            if (choose != los) {
                System.out.println("PUDŁO!\n**********************");
            }

        } while (los != choose);

//      Zakonczenie gry. Wygrana
        if (los == choose) {
            System.out.println("BRAWO!\n**********************");
        }

    }

}
