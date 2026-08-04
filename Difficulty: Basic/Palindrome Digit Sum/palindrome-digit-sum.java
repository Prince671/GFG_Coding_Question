class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
            
        }
        int finalVal=sum;
        
        int reverse = 0; 
        
        while (sum != 0) { 
            int lastDigit = sum % 10; 
            reverse = (reverse * 10) + lastDigit; 
            sum /= 10; 
        } 
        
        return reverse==finalVal; 
    }
}