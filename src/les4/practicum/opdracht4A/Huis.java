package les4.practicum.opdracht4A;

public class Huis {
        private String adres;
        private int bouwjaar;
        private Persoon huisbaas;

        public Huis(String adres, int bouwjaar) {
            this.adres = adres;
            this.bouwjaar = bouwjaar;
        }

    public int getBouwjaar() {
            return bouwjaar;
    }

    public String getAdres() {
            return adres;
    }

    public void setHuisbaas(Persoon h) {
        huisbaas = h;
    }

    public Persoon getHuisbaas() {
            return huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + getAdres() + " is gebouwd in " + 1970 + "\n en heeft huisbaas "  + huisbaas.toString();
    }

}
