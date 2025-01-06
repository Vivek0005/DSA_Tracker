// Given a string s, return true if the string is palindrome, otherwise false.
// A string is called palindrome if it reads the same forward and backward.

class Solution {
    public boolean palindromeCheck(String s) {

        // helper function - pass string, starting and ending index
        return isPalindrome(s, 0, s.length() - 1);
    }

    public boolean isPalindrome(String str, int left, int right) {

        // base case : left > right i,e all elements compared
        if (left >= right) {
            return true;
        }

        // check first last elements then -- and check again
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);
    }
}