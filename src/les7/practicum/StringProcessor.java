package les7.practicum;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor() {

    }

    public String verwerk(String input){
        String i = input;
        for(OpmaakProces p: processen){
            i = p.maakOp(i);
        }
        return i;
    }

    public void voegProcesToe(Object opmaakProces){
        if(opmaakProces instanceof OpmaakProces){
            OpmaakProces nieuwProces = (OpmaakProces) opmaakProces;
            processen.add(nieuwProces);
        }
    }


}
