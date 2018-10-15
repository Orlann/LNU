package main.java.stringTasks.Task8_MinDifferentCharInWord;

public class RunnerTask8 {

    static void arrayInfo(String[] array) {
        int[] countsOfLetters = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            countsOfLetters[i] = countOfDifferentLetters(array[i]);
        }
        int index = indexOfMinElement(countsOfLetters);
        System.out.println(array[index]);
        System.out.println(countsOfLetters[index]);

    }

    private static int indexOfMinElement(int[] countsOfLetters) {
        int min = countsOfLetters[0];
        int index = 0;
        for (int i = 0; i < countsOfLetters.length; i++) {
            if (min > countsOfLetters[i]) {
                min = countsOfLetters[i];
                index = i;
            }
        }
        return index;
    }

    static int countOfDifferentLetters(String word) {
        char[] differentLetters = new char[word.length()];
        int j = 0;
        int count = 0;
        char symbol;
        for (int i = 0; i < word.length(); i++) {
            symbol = word.charAt(i);
            if (isNotExistInArray(differentLetters, symbol)) {
                differentLetters[j] = symbol;
                j++;
                count++;
            }
        }
        return count;
    }

    private static boolean isExistInArray(char[] array, char symbol) {
        for (char c : array) {
            if (c == symbol) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotExistInArray(char[] array, char symbol) {
        return !isExistInArray(array, symbol);
    }

    public static void main(String[] args) {
        String sentence = "abcd abc abab df adad abc";
        String[] words = sentence.split(" ");
        arrayInfo(words);

//        System.out.println(CharCounter.countUniqueCharacters("abcdabcd"));
//        System.out.println(CharCounter.countUniqueCharactersV7("abcdabcdf"));
    }
}
