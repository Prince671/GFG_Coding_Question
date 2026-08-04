class Solution { 
    public int reverseDigits(int n) { 
        int reverse = 0; 
        
        while (n != 0) { 
            int lastDigit = n % 10; 
            reverse = (reverse * 10) + lastDigit; 
            n /= 10; 
        } 
        
        return reverse; 
    } 
}
