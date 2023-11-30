// Reverse words in a given string
// Example "I love programming" -> "programming love I"

public class Task3 {
    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed;
    }
}
