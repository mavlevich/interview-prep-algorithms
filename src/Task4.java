//Implement a string compression function that takes a string as input and prints the count of consecutive
//occurrences of each unique character in the format "character_count." If a character appears only once,
//simply print the character without a count.
//For example, given the input "aabbbcc," the output should be "a2b3c2."

public class Task4 {
    public static String stringCompression(String s1) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (i < s1.length() - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s1.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        return compressed.toString();
    }
}
