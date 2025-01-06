/*
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
Example 1
Input : num = 529
Output : 7

Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16
In second iteration the digits sum will be 1 + 6 => 7.
Now single digit is remaining , so we return it.
 */

class Solution {
    public int addDigits(int num) {

        // base case : only single digit remaining
        if (num < 10) {
            return num;
        }

        int sum = 0;

        // calculate sum for current number
        while (num > 0) {
            int lastDig = num % 10;
            sum += lastDig;
            num /= 10;
        }

        // recurse while passing current sum as next number
        return addDigits(sum);
    }
}