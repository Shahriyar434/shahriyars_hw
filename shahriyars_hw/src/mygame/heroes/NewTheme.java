package mygame.heroes;

public class NewTheme {
    public static void main(String[] args) {
        String str1 = "UrokiJava";
        String str2 = "UrokiJava";

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        System.out.println("First character of str1: " + str1.charAt(0));
        System.out.println("First character of str2: " + str2.charAt(0));
        System.out.println("Are first characters equal? " + (str1.charAt(0) == str2.charAt(0)));

        String last4Str1 = str1.substring(str1.length() - 4);
        String last4Str2 = str2.substring(str2.length() - 4);

        System.out.println("Last 4 characters of str1: " + last4Str1);
        System.out.println("Last 4 characters of str2: " + last4Str2);
        System.out.println("Are last 4 characters equal? " + last4Str1.equals(last4Str2));

       
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
    }
}
