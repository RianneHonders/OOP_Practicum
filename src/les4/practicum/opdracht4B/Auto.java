package les4.practicum.opdracht4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto (String tp, double prPD) {
        type = tp;
        prijsPerDag = prPD;
    }

    public void setPrijsPerDag(double prPD) {
        prijsPerDag = prPD;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type +  " met prijs per dag: " + prijsPerDag;
    }
}
