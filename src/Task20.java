//Given a string s, find the first non-repeating character in it and return its index.
//If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1
//
// Leetcode, level: EASY
// https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;
import java.util.Map;


public class Task20 {
    public static int firstUniqChar(String s) {
        int index = -1;
        for(char ch : s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }

        return index;
    }


    // solution with HashMap
    public int firstUniqCharHashMap(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charFrequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

}
