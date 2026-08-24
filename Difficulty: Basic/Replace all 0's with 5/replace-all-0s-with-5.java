class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0){
            return 5;
        }
        int reversed=0;
        while(n>0){
            int digit=n%10;
            if(digit==0){
                reversed=reversed*10+5;
            }else{
                reversed=reversed*10+digit;
            }
            n/=10;
        }
        int result=0;
        while(reversed>0){
          int digit=reversed%10;
          result=result*10+digit;
          reversed/=10;
        }
        
        return result;
    }
}