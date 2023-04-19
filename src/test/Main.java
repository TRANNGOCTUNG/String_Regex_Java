package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        String str = "1-12-2000";
        String str1 = "1,12,300";
        Matcher matcher = pattern.matcher(str);
        Matcher matcher2 = pattern.matcher(str1);
        System.out.println(matcher.matches());
        System.out.println(matcher2.matches());
    }
}
