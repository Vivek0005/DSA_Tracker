/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.
 */

// Brute force - time : O(Nlogn)
// space : O(N)

import java.util.Arrays;

class Solution {
    public boolean anagramStrings(String s, String t) {

        // if length not equal, cant be anagram
        if (s.length() != t.length())
            return false;

        // convert strings to char arrays
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);

    }
}

// optimal
// time - O(N)
// space - O(1)

// optimal
// time : O(N)
// space : O(1)

import java.util.Arrays;

class Solution {
    class Solution {
        public boolean anagramStrings(String s, String t) {
            // base case: strings of different lengths can't be anagrams
            if (s.length() != t.length())
                return false;

            // Initialize an array for character freq count
            int[] frequency = new int[26];

            for (int i = 0; i < s.length(); i++) {
                // Increment for the character in `s` and decrement for the
                // character in `t`
                frequency[s.charAt(i) - 'a']++;
                frequency[t.charAt(i) - 'a']--;
            }

            // Check if all counts are zero else return false
            for (int count : frequency) {
                if (count != 0)
                    return false;
            }

            return true;
        }
    }
}
