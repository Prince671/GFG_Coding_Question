class Solution {
    static boolean isPowerOf3(int n) {
        // code here
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}