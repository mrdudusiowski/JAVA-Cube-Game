package dicegame;

import dicegame.statistics.WinStatistics;
import dicegame.players.PlayerComp;
import dicegame.players.Player;

public class DiceGame {

    public static void main(String[] args) {

//      Deklaracja zmiennych
        WinStatistics stats = new WinStatistics();
        Game game = new Game(stats);
        Player player = new PlayerComp("Jan");     //PlayerHuman lub PlayerComp

//      Powitanie
        System.out.println("Witamy, właśnie losujemy liczbę, zgadnij ją:\n\n");

        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Zdzichu"));
        game.addPlayer(new PlayerComp("Alek"));
        game.addPlayer(new PlayerComp("Jarek"));
//       game.printPlayers();
//       game.removePlayer("Jan");
//       game.printPlayers();

        for (int i = 0; i <= 100; i++) {
            game.play();
        }

        System.out.print("\n\n************\n\n");
        stats.showStats();

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


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 List<String> list = new ArrayList();
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
 */
