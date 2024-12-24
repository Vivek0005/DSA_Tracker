// Given an array of n elements. The task is to return the count of the number
// of odd in the array.

class Solution {
    public int countOdd(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            // check for odd and if odd then increment count
            if (arr[i] % 2 != 0)
                count++;
        }
        return count;
    }
}