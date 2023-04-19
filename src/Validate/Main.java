package Validate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final String[] VALIDATE = new String[]{"abcesd","_abcds","_abcdgj"};
    public static final String[] VALIDATE_ARRAY = new String[]{".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        AccountExample account = new AccountExample();
        for (String s:VALIDATE
             ) {
            boolean isValid = account.validate(s);
            System.out.println("Account is:" + s + " is:" + isValid);
        }
        for (String s: VALIDATE_ARRAY) {
            boolean isValid = account.validate(s);
            System.out.println("Account is:" + s + " is:" + isValid);
        }
    }
}
