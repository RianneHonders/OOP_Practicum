package les7.practicum;

import java.util.Locale;

public class HoofdletterProces implements OpmaakProces{

    @Override
    public String maakOp(String input) {
       return input.toUpperCase(Locale.ROOT);
    }
}
