class Solution {
    public int[] reverseArray(int[] nums) {
        // only 1 element
        if(nums.length<=1){
            return nums;
        }

        // pass left right indices and array
        return reverse(nums, 0,nums.length-1);
    }

    public int[] reverse(int [] nums, int left, int right){
        
        // Base case: pointers have crossed, the array is reversed
        if(left>=right){
            return nums;
        }        

        // swap left and right element
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]=temp;

        // recurse with updated pointers
        return reverse(nums,left+1,right-1);
    }
}