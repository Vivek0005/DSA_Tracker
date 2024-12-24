/*
 * You are given an integer n. You need to find all the divisors of n. Return
 * all the divisors of n as an array or list in a sorted order.
 */

class Solution {
    public int[] divisors(int n) {

        int arr[] = new int[n];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[idx] = i;
                idx++;
            }
        }

        // Creatw new array of the exact size to store the divisors
        int arr2[] = new int[idx];

        for(int i = 0; i < idx; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }
}
