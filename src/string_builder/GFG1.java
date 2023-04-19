package string_builder;

public class GFG1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("GFG1");
        System.out.println("String =  " + sb.toString());

        StringBuilder sb2 = new StringBuilder("ABCDST");
        System.out.println("String = " + sb2.toString());

        StringBuilder sb3 = new StringBuilder(sb.toString());
        System.out.println("String = " + sb3.toString());

        String string = "ABCDST";
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println("String = " + stringBuilder.toString());
    }
}
