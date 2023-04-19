package validate1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String VALIDATE_NAME = "^[CAP][0-9]{4}+[GHIK]$";
    public static final String[] VALIDATE = new String[] {"C0223G", "A0323K"};
    public static final String[] VALIDATEE = new String[] {"M0318G","P0323A"};
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(VALIDATE_NAME);
        for (String s : VALIDATE) {
            Matcher m = pattern.matcher(s);
            System.out.println(s + m.matches());
        }
        for (String s : VALIDATEE
             ) {
            Matcher m = pattern.matcher(s);
            System.out.println(s + m.matches());
        }

    }
}
