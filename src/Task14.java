//Given a dictionary of the words(strings) which contains different words & you are given an input string e.g. “abd”.
//You need to find the largest word available in the supplied dictionary which can be made using the letters of input string.
//The returned word can contain only the same no of occurrences of the letters as given in the input string i.e.
//if a letter is given once then in the output it should be existed only once. Examples:
//
//1, Dictionary {“to”, “banana”, “toe”, “dogs”, “ababcd”, “elephant”} and input string is “eot”. Output should be “toe”
//2, Dictionary is same as specified in example a but the input string is “ogtdes” and the output is “dogs” and “toes”


import java.util.Arrays;

public class Task14 {
    public static String findLargestWord (String[] dictionary, String input) {
        String largestWord = "";

        for (String word : dictionary) {
            if (canFormWord(word, input) && word.length() > largestWord.length()) {
                largestWord = word;
            }
        }


        return largestWord;
    }

    public static boolean canFormWord (String word, String input) {
        char[] wordChar = word.toCharArray();
        char[] inputChar = input.toCharArray();

        Arrays.sort(wordChar);
        Arrays.sort(inputChar);

        return Arrays.equals(wordChar, inputChar);
    }
}
