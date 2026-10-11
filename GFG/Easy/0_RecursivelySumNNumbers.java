/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/recursively-sum-n-numbers/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int recursiveSum(int n) {
        // code here
        if(n==0){
            return 0;
        }
        
        return n+recursiveSum(n-1);
    }
}
