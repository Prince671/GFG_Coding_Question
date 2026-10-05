/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {

    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int poppedValue = st.pop();

        insertAtBottom(st, x);

        st.push(poppedValue);
    }

    public static void reverseStack(Stack<Integer> st) {

        // Base case
        if (st.isEmpty()) {
            return;
        }

        // Remove top element
        int topValue = st.pop();

        // Reverse remaining stack
        reverseStack(st);

        // Insert removed element at bottom
        insertAtBottom(st, topValue);
    }
}
