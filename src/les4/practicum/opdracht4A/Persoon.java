package les4.practicum.opdracht4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
