package a2.projekt;

import java.util.Random;

public class A2Projekt {

    public static void main(String[] args) {

//      Deklaracja zmiennych
        Random cube = new Random();
        //Player player = new Player("Andrzej");
        //PlayerHuman player = new PlayerHuman("Andrzej");
        Player player = new PlayerHuman("Andrzej");     //PlayerHuman lub PlayerComp

//      Imie player'a
        player.setName("Andrzej");

//      Powitanie
        System.out.println("Witamy, wlasnie losujemy liczbe, zgadnij ja:\n\n");

        //Wylosowanie liczb
        int los = cube.nextInt(6) + 1;
        int choose;

//      Pętla sprawdzająca
        do {
            choose = player.guess();

            System.out.println(player.getName() + " wybral " + choose);

            //Warunki sprawdzajace
            if (choose > 6) {
                System.out.println("Kostka ma co najwyzej 6 oczek!");
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

/*
KISS - Keep it simple stupid
REFAKTORYZACJA - PRACOWNAIE NAD PROGRAMEM
 */
