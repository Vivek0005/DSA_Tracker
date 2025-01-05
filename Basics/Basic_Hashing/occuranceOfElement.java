/*
 * Given an array of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. 
 * If there are multiple elements that appear a maximum number of times, find the smallest of them.
 */

// 1.  BRUTE FORCE - TC= O(N^2) SC= O(max)

import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {

        int visited[] = new int[2147483];
        int count, maxOccurance = 0, maxElement = -1;

        for (int i = 0; i < nums.length; i++) {

            count = 0;
            int curElement = nums[i];

            // check if already visited
            if (visited[curElement] != 0) {
                continue;
            } else {
                visited[curElement] = 1;
            }

            // loop for counting the occurances
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == curElement) {
                    visited[curElement]++;
                    count++;
                }
            }

            // check and update maxOccurance and element
            if (maxOccurance < count) {
                maxOccurance = count;
                maxElement = curElement;
            } else if (maxOccurance == count) {
                if (curElement < maxElement) {
                    maxElement = curElement;
                }
            }
        }

        return maxElement;
    }
}

// 2.BETTER SOLUTION - TC - O(N) SC - O(max)

class Solution2 {
    public int mostFrequentElement(int[] nums) {

        int max = 0;

        // find maxElement to create hash array of that size
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int hash[] = new int[max + 1];

        // increment the visited elements occuarances in hash array
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int maxOccurance = 0;
        int element = -1;

        for (int i = 0; i < hash.length; i++) {
            if (maxOccurance < hash[i]) {
                maxOccurance = hash[i];
                element = i;
            } else if (maxOccurance == hash[i]) {
                if (element > i) {
                    element = i;
                }
            }
        }

        return element;
    }
}

// 3.OPTIMAL SOLUTION - TC - O(N) SC- O(N)

class Solution3 {
    public int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int highestOccurance = 0;
        int element = -1;

        for (int i = 0; i < nums.length; i++) {
            // Update frequency in the map
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Check if current frequency > highest frequency
            if (highestOccurance < map.get(nums[i])) {
                highestOccurance = map.get(nums[i]);
                element = nums[i];
            }
            // if same frequency choose the smaller element
            else if (highestOccurance == map.get(nums[i])) {
                if (nums[i] < element) {
                    element = nums[i];
                }
            }
        }
        return element;
    }
}