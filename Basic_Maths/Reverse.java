// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

class Solution {
    public int reverseNumber(int n) {

        int rev = 0;

        while (n > 0) {
            // take last digit
            int lastDigit = n % 10;

            // add lastDigit to rev
            rev = (rev * 10) + lastDigit;

            // remove lastDigit
            n /= 10;
        }

        return rev;
    }
}