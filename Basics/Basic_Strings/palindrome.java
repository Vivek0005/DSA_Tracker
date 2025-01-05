class Solution {
    public boolean palindromeCheck(String s) {
        return checkForPalindrome(s);
    }

    public boolean checkForPalindrome(String s) {
        // use 2 pointer approach
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // If characters don't match, it's not a palindrome

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}