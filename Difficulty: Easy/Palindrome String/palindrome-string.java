class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder reversed=new StringBuilder();
        char arr[]=s.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            reversed.append(arr[i]);
        }
        if(reversed.toString().equals(s)){
            return true;
        }
        return false;
    }
}