package main.java.stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9_LatinWords {
    final static String TEXT = "One two three раз два три one1 two2 123";

    public static void findAllLatinWords(String string) {
        String[] strings = string.split(" ");
        int count=0;
//        for (String s : strings) {
//            Pattern pattern = Pattern.compile("[A-Za-z&&[^0-9]]+");
//            Matcher matcher = pattern.matcher(s);
//            while (matcher.find()){
//                count++;
//                System.out.println(matcher.group());
//            }
//        }
        Pattern pattern1 = Pattern.compile("[A-Za-z&&[^0-9]]+");
        Matcher matcher1 = pattern1.matcher(TEXT);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        findAllLatinWords(TEXT);
    }
}
