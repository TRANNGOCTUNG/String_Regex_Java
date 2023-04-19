package regexEmail;

public class Main {
//    private static EmailExample emailExample;
//    public static String[] validateEmail = new String[]{"a@gmail.com,ab@yahoo.com,abc@hotmail.com"};
//    public static String[] invalidEmail = new String[]{"@gmail.com,ab@gmail.,@#abc@gmail.com"};
//    public static void main(String[] args) {
//        emailExample = new EmailExample();
//        for (String email : validateEmail
//             ) {
//            boolean valid = emailExample.validate(email);
//            System.out.println("Email  " + email + " valid : " + valid);;
//        }
//        for (String email: invalidEmail) {
//            boolean valid = emailExample.validate(email);
//            System.out.println("Email  " + email + " valid : " + valid );
//        }
//    }
private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com","ngoctung@gmail.com","aa@gmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
