class Solution {
    public boolean checkPrime(int num) {
        
        // base case 0 and 1 = false 
        if (num<=1)
            return false;

        return primeOrNot(num,2);
    }

    // helper function
    public boolean primeOrNot(int num, int i){

        // no need to check after sqrt of i
        if(i>Math.sqrt(num)){
            return true;
        }

        // check for divisibility
        if(num%i == 0){
            return false;
        }

        // recurse
        return primeOrNot(num,i+1);
    }
}