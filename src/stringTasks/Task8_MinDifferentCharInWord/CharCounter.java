package stringTasks.Task8_MinDifferentCharInWord;

import com.sun.deploy.util.StringUtils;

public class CharCounter {
    public static long countUniqueCharacters(String input) {
        return input.chars()
                .distinct()
                .count();
    }

    public static int countUniqueCharactersV7(String input) {
        String buffer = "";
        for (int i = 0; i < input.length(); i++) {
            if (!buffer.contains(String.valueOf(input.charAt(i)))) {
                buffer += input.charAt(i);
            }
        }
        return buffer.length();
    }
}
