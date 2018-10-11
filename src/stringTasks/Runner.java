package stringTasks;

public class Runner {

    private static boolean isContains(char[] array, char symbol) {
        for (char c : array) {
            if (c == symbol) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotContains(char[] processedSymbols, char symbol) {
        return !isContains(processedSymbols, symbol);
    }

    private static int countOccurrences(String inputString, char symbol) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    private static int wordInfo(String word) {
        char[] processedSymbols = new char[word.length()];
        int[] countsOfProcessedSymbols = new int[word.length()];
        int processedIndex = 0;
        char symbol;
        for (int i = 0; i < word.length(); i++) {
            symbol = word.charAt(i);
            if (isNotContains(processedSymbols, symbol)) {
                processedSymbols[processedIndex] = symbol;
                countsOfProcessedSymbols[processedIndex] = countOccurrences(word, symbol);
                processedIndex++;
            }
        }
        return maxElement(countsOfProcessedSymbols);

    }

    static String maxCountOfSymbols(char[] letterArray, int[] countArray) {
        int max = countArray[0];
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (max < countArray[i]) {
                max = countArray[i];
                index = i;
            }
        }
        return letterArray[index] + " " + countArray[index];
    }

    private static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int indexOfMaxElement(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String sentence = "abcd abbccccdd aaabbbcccddd rrrqqqqqoooo";
        String[] wordArray = sentence.split(" ");
        int[] wordMaxCountOfLetter = new int[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            wordMaxCountOfLetter[i] = wordInfo(wordArray[i]);
        }
        int maxCount = maxElement(wordMaxCountOfLetter);
        for (int i = 0; i < wordMaxCountOfLetter.length; i++) {
            if (wordMaxCountOfLetter[i] == maxCount) {
                System.out.print(wordArray[i] + " ");
                System.out.println(wordMaxCountOfLetter[i]);
            }
        }
    }

}
