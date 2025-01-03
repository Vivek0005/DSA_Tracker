// Given an array nums, find the sum of elements of array using recursion.

class Solution {
    public int arraySum(int[] nums) {
        
        return sumUp(nums,0);
    }

    // helper function to calculate sum
    public int sumUp(int[] nums,int index){

        //base case : index out of bounds
        if(index >= nums.length)
            return 0;

        // add current element to next element
        return nums[index]+(sumUp(nums,index+1));
    }
}