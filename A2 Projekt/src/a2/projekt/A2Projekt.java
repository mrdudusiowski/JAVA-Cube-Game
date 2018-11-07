package a2.projekt;

import java.util.Random;

public class A2Projekt {

    public static void main(String[] args) {

//      Deklaracja zmiennych
        Random cube = new Random();
        //Player player = new Player("Andrzej");
        //PlayerHuman player = new PlayerHuman("Andrzej");
        Player player = new PlayerComp("Andrzej");     //PlayerHuman lub PlayerComp

//      Imie player'a
        try {
            player.setName("");
        } catch (IllegalArgumentException ex) {
            System.err.println("Błąd, źle wprowadzone dane! " + ex.getMessage());

        }

//      Powitanie
        System.out.println("Witamy, właśnie losujemy liczbę, zgadnij ją:\n\n");

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

/*
KISS - Keep it simple stupid
REFAKTORYZACJA - PRACOWNAIE NAD PROGRAMEM
Wyrażenia regularne - regex101.com ^[a-zA-Z][a-zA-Z0-9@\-_.]{2,29}$
 */
