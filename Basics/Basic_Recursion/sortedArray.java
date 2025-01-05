class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {

        // if array size is 1 or less already sorted
        if (nums.size() <= 1)
            return true;

        return check(nums, 0, 1);
    }

    public boolean check(ArrayList<Integer> nums, int curIdx, int nextIdx) {

        // if no more elements to compare return true
        if (nextIdx >= nums.size())
            return true;

        // if current element > next element
        // i.e not sorted, return false
        if (nums.get(curIdx) > nums.get(nextIdx))
            return false;

        // recurse - check next elements
        return check(nums, curIdx + 1, nextIdx + 1);

    }
}