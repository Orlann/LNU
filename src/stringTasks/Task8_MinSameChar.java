package stringTasks;

import java.util.regex.Pattern;

public class Task8_MinSameChar {
    final static String TEXT="fffff  ab  f  1234  jkjk";


    public static void main(String[] args) {
        findWordWithMinSameChar(TEXT);
    }

    public static void findWordWithMinSameChar(String text){
//        Pattern pattern = Pattern.compile(" ");
//        String[] words = pattern.split(text);

        String [] words = text.split(" ");
        for (String s: words) {
            System.out.println(s);
        }

    }
}
