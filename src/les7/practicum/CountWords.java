package les7.practicum;

public class CountWords implements OpmaakProces{

    @Override
    public String maakOp(String input) {
        String s = input;
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            // If the current char is space and next char is not a space
            // then increment count
            if((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')){
                count++;
            }
        }
        return input + "\nDeze zin bevat " + count + " woorden.";
    }
}
