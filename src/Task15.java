//Q. Return the start index and length of the longest substring having identical characters in a given String.
//i/p : S = "aabbbbbccddb"
//o/p: [2,5]
//explaination : As longest substring is 'bbbbb' of length 5 and start index as 2
//i/p: S = "aabbb22rrrrr345571111111"
//o/p: [17,7]
//explaination : As '1111111' is the longest substring of length 7 and start index =17


public class Task15 {
    public static int[] largestSubString(String s) {
        int start = 0;
        int maxLength = 1;
        int currentLength = 1;

        if (s == null || s.length() == 0) {
            return new int[]{};
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = i - maxLength;
                }
                currentLength = 1;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = s.length() - maxLength;
        }

        return new int[] {start, maxLength};
    }
}
