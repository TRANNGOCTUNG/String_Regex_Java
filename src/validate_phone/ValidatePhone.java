package validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String VALIDATION_PHONE = "^84-[0-9]{10}$";
    public static final String[] VALIDATION = new String[]{"84-0978489648","(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(VALIDATION_PHONE);
        for (String s : VALIDATION) {
            Matcher m = pattern.matcher(s);
            System.out.println(s + m.matches());
        }
    }
}
