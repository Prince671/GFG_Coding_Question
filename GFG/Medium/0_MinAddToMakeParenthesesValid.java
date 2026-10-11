/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/min-add-to-make-parentheses-valid/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int minParentheses(String s) {
        // code here
        Deque<Character> st=new ArrayDeque<>();
        int addtion=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    addtion++;
                }
                else{
                    st.pop();
                    
                }
            }
        }
        
        int finalAns=addtion+st.size();
        return finalAns;
    }
}

