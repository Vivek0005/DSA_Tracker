/*You are given an integer n. 
You need to check whether the number is a palindrome number or not.
Return true if it's a palindrome number, otherwise return false. */

class Solution {
    public boolean isPalindrome(int n) {
        int duplicate = n;
        int rev = 0;

        // reverse the number
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }

        // directly compare and return
        return (rev == duplicate);
    }
}