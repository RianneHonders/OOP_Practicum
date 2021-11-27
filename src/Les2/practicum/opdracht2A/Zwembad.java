package Les2.practicum.opdracht2A;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;

    public Zwembad(Double br, Double ln, Double dp) {
        breedte = br;
        lengte = ln;
        diepte = dp;
    }

    public Double getBreedte() {
        return breedte;
    }

    public Double getLengte() {
        return lengte;
    }

    public Double getDiepte() {
        return diepte;
    }

    public void setBreedte(double nwBreedte) {
        breedte = nwBreedte;
    }

    public void setLengte(double nwLengte) {
        lengte = nwLengte;
    }

    public void setDiepte(double nwDiepte) {
        diepte = nwDiepte;
    }


    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}
