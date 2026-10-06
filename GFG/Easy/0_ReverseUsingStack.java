/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public String reverse(String S) {
        // code here
        Deque<Character> st=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();
        for(char ch:S.toCharArray()){
            st.push(ch);
        }
        while(st.size()>0){
            char ch=st.pop();
            ans.append(String.valueOf(ch));
        }
        return ans.toString();
    }
}
