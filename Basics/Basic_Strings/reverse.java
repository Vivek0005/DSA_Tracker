class Solution {
    public void reverseString(Vector<Character> s) {
        
    // 2 pointer approach visualizing the string as an array
    int left=0;
    int right=s.size()-1;

        // swap first and last characters and continue
        while( left < right){
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);

            left++;
            right--;
        }
    }
}