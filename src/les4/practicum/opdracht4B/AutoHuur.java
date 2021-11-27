package les4.practicum.opdracht4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(){
        double price = 0;
        if (gehuurdeAuto != null && aantalDagen > 0){
            price = aantalDagen * gehuurdeAuto.getPrijsPerDag();
            if(huurder != null && huurder.getKorting() != 0){
                price = price * (100 - huurder.getKorting())/100;
            }
        }
        return price;
    }

    @Override
    public String toString() {
        String geenAuto = "  er is geen auto bekend";
        String geenHuurder = "  er is geen huurder bekend";
        String geenPrijs = "  aantal dagen: 0 en dat kost 0.0";

        if (gehuurdeAuto != null){
            geenAuto = "  autotype: " + gehuurdeAuto;
        }

        if (huurder != null ){
            geenHuurder = huurder.toString();
        }

        if (huurder != null && gehuurdeAuto != null){
            geenPrijs =  "  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }

        return geenAuto +"\n" +  geenHuurder + "\n" + geenPrijs;
    }
}

