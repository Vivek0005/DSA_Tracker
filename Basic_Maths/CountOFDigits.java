// You are given an integer n. You need to return the number of digits in the number.

class Solution {
    public int countDigit(int n) {

        // edge case - n=0
        if (n == 0)
            return 1;

        // var to keep track of count
        int count = 0;

        // removing last digit and incrementing count
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}