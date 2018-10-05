package stringTasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_AllSubstring {
    final static String TEXT = "Versions: Java 5, Java 6, Java 7, Java 8, Java 9, Java 10.";

    public static void main(String[] args) {
        findAllJava(TEXT);
    }

    public static void findAllJava(String string) {
//        Pattern pattern = Pattern.compile("Java ([1-9])");
        Pattern pattern = Pattern.compile("Java \\w*");     // може бути і так      Pattern.compile("Java (\\w*)")
        Matcher matcher = pattern.matcher(string);
        while (matcher.find())
            System.out.println(matcher.group());

        System.out.println();
        Pattern pattern1 = Pattern.compile(":|;");
        String[] animals = pattern1.split("cat:dog;bird:cow");
        Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));
    }
}
