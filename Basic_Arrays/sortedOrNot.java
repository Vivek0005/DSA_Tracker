// Given an array arr of size n, the task is to check if the given array is
// sorted in (ascending / Increasing / Non-decreasing) order. If the array is
// sorted then return True, else return False.

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            // if the current element is greater than next (then its not sorted in ascending)
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }
}