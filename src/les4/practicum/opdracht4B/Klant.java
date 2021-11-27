package les4.practicum.opdracht4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String getNaam() {
        return naam;
    }

    public void setKorting(double kP) {
        kortingsPercentage = kP;
    }

    public String toString(){
       return "  op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";

    }


}
