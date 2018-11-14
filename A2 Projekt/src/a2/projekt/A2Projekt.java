package a2.projekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A2Projekt {

    public static void main(String[] args) {

//      Deklaracja zmiennych
        Game game = new Game();
        Player player = new PlayerComp("Jan");     //PlayerHuman lub PlayerComp
        List<String> list = new ArrayList();

//      Powitanie
        System.out.println("Witamy, właśnie losujemy liczbę, zgadnij ją:\n\n");

        list.add("raz");
        list.add("dwa");
        list.add("trzy");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String o : list) {
            System.out.println(o);
        }
        
        Iterator<String> it= list.iterator();
        
        while(it.hasNext()){
        System.out.println(it.next());
        }

        game.addPlayer(player);
        game.play();

    }

}

/*
KISS - Keep it simple stupid
REFAKTORYZACJA - PRACOWNAIE NAD PROGRAMEM
Wyrażenia regularne - regex101.com ^[a-zA-Z][a-zA-Z0-9@\-_.]{2,29}$
        //Player player = new Player("Andrzej");
        //PlayerHuman player = new PlayerHuman("Andrzej");
        //Imie player'a
       try {
            player.setName("");
        } catch (IllegalArgumentException ex) {
            System.err.println("Błąd, źle wprowadzone dane! " + ex.getMessage());

        }
 */
