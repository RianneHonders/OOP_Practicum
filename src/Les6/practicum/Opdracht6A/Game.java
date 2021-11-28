package Les6.practicum.Opdracht6A;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        double w = this.nieuwprijs;
        int d = LocalDate.now().getYear() - releaseJaar;
        for(int i=0; i<d; i++){
            double c = 0.7;
            w *= c;
        }
        return w;
    }

    public boolean equals(Object andereObject){
        boolean zelfdeGame = false;
        if (andereObject instanceof  Game) {
            Game andereGame = (Game) andereObject;
            if(this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar){
                zelfdeGame = true;
            }
        }
        return zelfdeGame;
    }

    public String toString(){
        return getNaam() + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwprijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }
}