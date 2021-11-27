package les5.practicum;

import java.util.ArrayList;

public class Klas {
    private ArrayList<Leerling> leerlingen;
    private String klasCode;



    public Klas(String kC) {
        klasCode = kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen(){
       return getLeerlingen().toArray().length;
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l: leerlingen){
            if (l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }
        }
    }

    @Override
    public String toString() {
        String s;
        s = "In klas V1Z zitten de volgende leerlingen: \n";
        for (Leerling l: leerlingen) {
            s += l.toString() + "\n";
        }
        return s;
    }


}
