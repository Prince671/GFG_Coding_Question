/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    static void mid(Stack<Integer> st, int count, int size){
        if(count==size/2){
            st.pop();
            return;
        }
        int x=st.pop();
        mid(st, count+1, size);
        st.push(x);
    }
    public void deleteMid(Stack<Integer> s) {
        // code here
        int size=s.size();
        mid(s, 0, size);
    }
}
