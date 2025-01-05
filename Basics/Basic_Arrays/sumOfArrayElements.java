// Given an array arr of size n, the task is to find the sum of all the elements in the array.

class Solution {
    public int sum(int arr[], int n) {
        int sum = 0;

        // loop through every single element and add it to sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
