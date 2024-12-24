// You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.

class Solution {
    public boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {

            // if any divisors exist b/w 2 and sqrt(n) then its not prime
            if (n % i == 0)
                return false;
        }

        return true;
    }
}