class Solution {
    boolean isPowerOfFour(int n) {
        // code here
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}