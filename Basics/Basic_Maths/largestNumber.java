/*You are given an integer n. Return the largest digit present in the number. */

class Solution {
    public int largestDigit(int n) {

        int largest = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            // compare largest and lastDigit and update if needed
            if (lastDigit > largest)
                largest = lastDigit;

            // remove lastDigit
            n /= 10;
        }

        return largest;
    }
}