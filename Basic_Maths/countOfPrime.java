/*
 * You are given an integer n. You need to find out the number of prime numbers
 * in the range [1, n] (inclusive).
 * Return the number of prime numbers in the range.
 */

class Solution {

    // fucntion to check if number is prime
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)

                return false;
        }
        return true;
    }

    public int primeUptoN(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            // if is prime increment the count 
            if (isPrime(i))
                count++;
        }

        return count;
    }
}