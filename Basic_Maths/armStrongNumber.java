/*You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Example 1

Input: n = 153
Output: true
Explanation: Number of digits : 3.

1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number. */

class Solution {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;

        int digitCount = String.valueOf(n).length();

        // Calculate the sum of each digit raised to the power of the lenth
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digitCount);
            n /= 10;
        }

        // compare and return
        return sum == original;
    }
}
