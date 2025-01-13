/*
 * Given an integer n. You need to recreate the pattern given below for any value of N. 
 * Let's say for N = 5, the pattern should look like as below:


*****
*****
*****
*****
*****
 */

class Solution {
    public void pattern1(int n) {

        // no of lines -outer loop
        for (int i = 1; i <= n; i++) {

            // no of times to print in each line = n
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }

    }
}