class Solution {
    public boolean checkRedundancy(String s) {
        // code here
        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '+' || ch == '*' || ch == '-' || ch == '/') {
                st.push(ch);
            }

            else if (ch == ')') {
                int countOperator = 0;

                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();

                    if (top == '+' || top == '*' || top == '-' || top == '/') {
                        countOperator++;
                    }
                }

                if (!st.isEmpty()) {
                    st.pop();  // remove '('
                }

                if (countOperator == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}