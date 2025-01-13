class Solution {
    public void pattern5(int n) {

        // no of lines = n
        for (int i = 1; i <= n; i++) {
            // no of times to print in each line = n-i+1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // new line
            System.out.println();

        }

    }
}

/*
 * 

*****
****
***
**
*

*/