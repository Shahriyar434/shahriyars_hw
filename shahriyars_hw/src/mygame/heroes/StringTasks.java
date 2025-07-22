package mygame.heroes;

public class StringTasks {
    public static void main(String[] args) {
        StringBuilder greeting = new StringBuilder("Hello");
        greeting.append(" World!");
        System.out.println("1: " + greeting);


        StringBuilder funString = new StringBuilder("Java creator");
        funString.insert(5, "is ");
        System.out.println("2: " + funString);


        String replaced = "Java".replace("Java", "Python");
        System.out.println("3: " + replaced);


        StringBuilder deleteWord = new StringBuilder("Delete this word");
        int start = deleteWord.indexOf("this");
        deleteWord.delete(start, start + 4);
        System.out.println("4: " + deleteWord);


        StringBuilder reverse = new StringBuilder("12345");
        reverse.reverse();
        System.out.println("5: " + reverse);


        String lengthString = "Java Programming";
        System.out.println("6: " + lengthString.length());


        StringBuilder twentyChars = new StringBuilder("abcdefghijklmnopqrst");
        twentyChars.delete(twentyChars.length() - 5, twentyChars.length());
        System.out.println("7: " + twentyChars);


        StringBuilder programStr = new StringBuilder("ProgrammingInJava");
        programStr.delete(10, programStr.length());
        System.out.println("8: " + programStr);


        StringBuilder replaceChar = new StringBuilder("Hell0");
        replaceChar.setCharAt(4, 'o');
        System.out.println("9: " + replaceChar);


        String template = "User {name} has {points} points";
        template = template.replace("{name}", "Abdul");
        template = template.replace("{points}", "150");
        System.out.println("10: " + template);
    }
}
