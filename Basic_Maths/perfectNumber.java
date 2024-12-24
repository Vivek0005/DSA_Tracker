/*You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors add up to the number itself.

Example 1
Input: n = 6
Output: true

Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6. */

class Solution {
    public boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            // check if its a perfect divisor if so add it to sum
            if (n % i == 0) {
                sum += i;
            }
        }

        // compare and return
        return (sum == n);
    }
}