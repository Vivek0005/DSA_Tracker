class Solution {
    public Vector<Character> reverseString(Vector<Character> s) {

        // helper function - pass string, starting and ending index
        return reverse(s, 0, s.size() - 1);
    }

    public Vector<Character> reverse(Vector<Character> str, int left, int right) {

        // base case : all elements are swapped and string is reversed
        if (left >= right) {
            return str;
        }

        // swap left and right characters
        char temp = str.get(left);
        str.set(left, str.get(right));
        str.set(right, temp);

        // recurse
        return reverse(str, left + 1, right - 1);
    }
}