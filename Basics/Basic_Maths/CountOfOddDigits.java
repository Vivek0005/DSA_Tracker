/*You are given an integer n. You need to return the number of odd digits present in the number.

The number will have no leading zeroes, except when the number is 0 itself.

    Example 1
    Input: n = 5
    Output: 1
    Explanation: 5 is an odd digit.

*/
class Solution {
    public int countOddDigit(int n) {

        // oddCount
        int count = 0;

        while (n > 0) {
            // take last digit
            int lastDigit = n % 10;

            // check if odd
            if (lastDigit % 2 == 1) {
                count++;
            }

            // remove last digit
            n /= 10;
        }

        return count;
    }
}