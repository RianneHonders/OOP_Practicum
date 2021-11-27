package Les2.practicum.opdracht2B;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    private String club;

    public Voetbalclub(String c) {
        club = c;

    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int aantalGespeeld() {
       return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten() {
        return aantalGewonnen *3 + aantalGelijk;
    }

    public String toString(){
        return club + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
