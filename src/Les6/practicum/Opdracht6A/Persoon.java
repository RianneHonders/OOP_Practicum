package Les6.practicum.Opdracht6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList <Game> games = new ArrayList <Game>();

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (getBudget() >= g.huidigeWaarde() && !games.contains(g)) {
            games.add(g);
            this.budget = budget - g.huidigeWaarde();
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> gameLijst){
        for(Game g : gameLijst){
            if (this.games.contains(g)){
                gameLijst.remove(g);
            }
        }
        return gameLijst;
    }

    public boolean verkoop(Game g, Persoon koper){
        boolean titel = false;
        if (games.contains(g) && !koper.games.contains(g) && koper.budget >= g.huidigeWaarde()) {
            this.games.remove(g);
            this.budget += g.huidigeWaarde();
            koper.koop(g);
            titel = true;
        }
        return titel;
    }


    public String toString(){
        String alles = naam + " heeft een budget van €" + String.format("%.2f", getBudget()) + " en bezit de volgende games:" ;
        for (Game g : games){
            alles += "\n" + g.toString();
        }
        return alles;
    }

}