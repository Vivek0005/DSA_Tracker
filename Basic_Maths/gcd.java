/*
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

Example 1
Input: n1 = 4, n2 = 6
Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.
*/

class Solution {
    public int GCD(int n1, int n2) {

        // Euclidean algorithm
        while (n1 != 0 && n2 != 0) {

            // Check which is greater and subtract it by smaller
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }

        if (n1 == 0)
            return n2;
        else {
            return n1;
        }
    }
}