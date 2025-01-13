/*
 * 
1
12
123
1234
12345

*/

class Solution {
    public void pattern3(int n) {
        // no of lines = n
        for (int i = 1; i <= n; i++) {
            // no of times to print in each line =i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // new line
            System.out.println();
        }
    }
}