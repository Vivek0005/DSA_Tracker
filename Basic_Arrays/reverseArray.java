// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

class Solution {
    public void reverse(int[] arr, int n) {

        // 2 pointers that point start and end of array
        int left = 0, right = n - 1;

        while (left < right) {

            // Swap first and last
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
