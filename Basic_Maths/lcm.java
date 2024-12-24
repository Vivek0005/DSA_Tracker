/*
 * You are given two integers n1 and n2. You need find the Lowest Common
 * Multiple (LCM) of the two given numbers. Return the LCM of the two numbers. 
 * The Lowest Common Multiple (LCM) of two integers is the lowest positive
 * integer that is divisible by both the integers.
 */

class Solution {

    // lcm = n1*n2 / gcd(n1,n2)

    int GCD(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2)
                n1 -= n2;
            else {
                n2 -= n1;
            }
        }
        if (n1 == 0)
            return n2;
        else
            return n1;
    }

    public int LCM(int n1, int n2) {

        int gcd = GCD(n1, n2);
        int lcm = (n1 * n2) / gcd;

        return lcm;
    }
}