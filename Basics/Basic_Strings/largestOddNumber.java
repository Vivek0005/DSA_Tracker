/*
 * Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
 * 
The number returned should not have leading zero's. But the given input string may have leading zero.

Example 1
Input : s = "5347"
Output : "5347"

Explanation : The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.
 */

class Solution {
    public String largeOddNum(String s) {

        int idx = s.length() - 1;

        // break if an odd number is encountered
        while (idx >= 0) {
            if ((s.charAt(idx) - '0') % 2 != 0) {
                int i = 0;
                break;
            }
            idx--;
        }

        // remove starting zeros
        int i = 0;
        while (i <= idx && s.charAt(i) == '0') {
            i++;
        }

        return s.substring(i, idx + 1);
    }
}