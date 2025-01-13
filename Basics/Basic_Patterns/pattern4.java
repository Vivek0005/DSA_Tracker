class Solution {
    public void pattern4(int n) {

        // no of lines = n
        for (int i = 1; i <= n; i++) {
            // no of times to print in each line = i
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // new line
            System.out.println();
        }
    }
}

/*
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */