package cube;

public abstract class Player {
//  Deklaracja zmiennych

    private String name = "Gracz";

    /*
    Kontruktory
     */
    public Player(String name) {
        setName(name);
    }

    public Player() {
        this.name = "Player";
    }

    /*
    Setter/Getter
     */
    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9@\\-_.]{2,29}$")) {
            this.name = name;
        } else {
            //  System.err.println("Blad, zle wproawdzone dane!");
            throw new IllegalArgumentException("Nieprawidłowe dane!");
        }
    }

    public String getName() {
        return name;
    }

//  Implementacja metody abstrakcyjnej, bez ciała
    public abstract int guess();

}

/*
Abstrakcyjna klasa Player, zawierająca abstrakcyjną metodę guess, powoduje dziedziczenie wnętrza,
Bez możliwości wywołania obiektu tej klasy
 */
