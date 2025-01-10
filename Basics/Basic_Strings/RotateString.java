/*
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Examples:
Input : s = "abcde" , goal = "cdeab"
Output : true

Explanation : After performing 2 shifts we can achieve the goal string from string s.
After first shift the string s is => bcdea
After second shift the string s is => cdeab.
 */

// BRUTE FORCE

// TIME - O(n^2)
// SPACE - O(n)
class Solution {
    public boolean rotateString(String s, String goal) {

        String left = "";

        for (int i = 0; i < s.length(); i++) {

            String right = s.substring(i);

            String rotatedString = right + left;

            // if rotated string matches goal return
            if (rotatedString.equals(goal)) {
                return true;
            }

            left += s.charAt(i);
        }

        // no substring found after n rotations i,e substring doesnt exist
        return false;
    }
}

// 2. OPTIMAL SOLUTION

// TIME - O(n)
// SPACE - O(n)
class Solution {
    public boolean rotateString(String s, String goal) {
        // Concat s with itself to capture all possible rotations
        String doubled = s + s;

        // if goal is a substring of the concatenated string
        return doubled.contains(goal);
    }
}
