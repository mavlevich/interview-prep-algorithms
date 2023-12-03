//Given a string s, find the length of the longest substring without repeating characters.
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//Constraints:
//
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.
//
//Leetcode, level: MEDIUM
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/


import java.util.HashSet;
import java.util.Set;


public class Task9 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;

        while (rightPointer < s.length()) {
            if (!charSet.contains(s.charAt(rightPointer))) {
                charSet.add(s.charAt(rightPointer));
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
                rightPointer++;
            }
            else {
                charSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return maxLength;
    }
}
