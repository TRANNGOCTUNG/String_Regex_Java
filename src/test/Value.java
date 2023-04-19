package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Value {
    private static final String EMAIL_ADDRESS = "^[\\S-1-9]$";
    public static void main(String[] args) {
        String strings ="mail";
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
        Matcher matcher = pattern.matcher("uo");
        System.out.println(matcher.matches());


    }
}
