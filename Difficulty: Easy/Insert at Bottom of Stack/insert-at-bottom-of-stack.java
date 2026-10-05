class Solution {
    public static void solve(Stack<Integer> st, int count, int size, int x){
        if(count==size){
            st.push(x);
            return;
        }
        int poppedValue=st.pop();
        solve(st, count+1, size, x);
        st.push(poppedValue);
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        int count=0;
        int size=st.size();
        solve(st, count, size, x);
        return st;
        
    }
}