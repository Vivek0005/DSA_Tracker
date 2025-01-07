/*
 * Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Examples:
Input : str = ["flowers" , "flow" , "fly", "flight" ]
Output : "fl"

Explanation : All strings given in array contains common prefix "fl".
 */

//for using sort method
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] str) {

        // USe string builder string to append the answer
        StringBuilder ans = new StringBuilder();

        // Sort array to get smallest and largest strings in dictionary order
        Arrays.sort(str);

        // Get first and last elements for comparison
        String first = str[0];
        String last = str[str.length - 1];

        // Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // If characters are diff then return
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            // If characters are the same, append them
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}
