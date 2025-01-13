/*
 
*
**
***
****
*****

 */

class Solution {
    public void pattern2(int n) {

        // outer loop - n times
        for (int i = 1; i <= n; i++) {
            // no of times to print in each line = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }

    }
}