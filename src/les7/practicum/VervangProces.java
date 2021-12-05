package les7.practicum;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;

    public VervangProces(String o, String nw) {
        oud = o;
        nieuw = nw;
    }

    @Override
    public String maakOp(String input) {
        return input.replace(oud, nieuw);
    }
}
