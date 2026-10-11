/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int orignal=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=(reverse*10)+digit;
            n/=10;
        }
        
        return (int)Math.pow(orignal, reverse);
    }
}

