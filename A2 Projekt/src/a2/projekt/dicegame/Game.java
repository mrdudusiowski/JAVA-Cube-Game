package dicegame;

import dicegame.statistics.NullStatistics;
import dicegame.statistics.Statistics;
import dicegame.players.Player;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    protected Random rand = new Random();
    protected List<Player> players = new ArrayList();
    protected Statistics stats = new NullStatistics();
    /*
    
    */
    public Game() {}
    /*
    
    */
    public Game(Statistics stats) {
        this.stats = stats;
    }
    /*
    
    */
    public void addPlayer(Player player) {
        if (player != null) {
            if (!isNameExists(player.getName())) {
                players.add(player);
            } else {
                player.setName(player.getName() + rand.nextInt(10));
                addPlayer(player);
            }

        } else {
            throw new IllegalArgumentException("Gracz nie może być wartoscia pusta");
        }
    }
    /*
    
    */
    private boolean isNameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    /*
    
    */
    public void removePlayer(String name) {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(name)) {
                it.remove();
                break;
            }
        }
    }
    /*
    
    */
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    /*
    
    */
    void play() {

//      Wylosowanie liczb
        int choose;
        boolean oneMore;

//      Pętla sprawdzająca
        do {
            oneMore = true;
            int los = rand.nextInt(6) + 1;

            System.out.println("**********************");
            System.out.println("Kostka: " + los);

            for (Player player : players) {

                choose = player.guess();
                System.out.println(player.getName() + " wybrał " + choose);

//      Warunki sprawdzajace
                if (choose > 6) {
                    System.out.println("Kostka ma co najwyżej 6 oczek!");
                }
                if (choose != los) {
                    System.out.println("PUDŁO!");
                }
                if (los == choose) {
                    oneMore = false;
                    System.out.println("BRAWO!");
                    stats.statsAdd(player.getName());
                }
            }
        } while (oneMore);

//      Zakonczenie gry. Wygrana
    }

}
