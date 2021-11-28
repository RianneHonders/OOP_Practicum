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

    public ArrayList<Game> gamesNietInBezit(ArrayList<Game> games){
        ArrayList<Game> gamesNietInBezit = new ArrayList<>();
        boolean bezit;
        for (Game game : games){
            bezit = false;
            for(Game persoonGame : this.games){
                if (persoonGame.equals(game)) {
                    bezit = true;
                    break;
                }
            }
            if(!bezit){
                gamesNietInBezit.add(game);
            }
        }
        return gamesNietInBezit;
    }

    public String toString(){
        String alles = naam + " heeft een budget van €" + String.format("%.2f", getBudget()) + " en bezit de volgende games:" ;
        for (Game g : games){
            alles += "\n" + g.toString();
        }
        return alles;
    }

}