import java.util.Stack;

class Solution { 
    public boolean isBalanced(String s) { 
        Stack<Character> st = new Stack<>(); 
        
        for (int i = 0; i < s.length(); i++) { 
            char current = s.charAt(i); 
            
            // Push opening brackets onto the stack
            if (current == '[' || current == '(' || current == '{') { 
                st.push(current); 
            } 
            // Handle closing brackets
            else if (current == ']' || current == ')' || current == '}') { 
                // Bug Fix 2: If stack is empty, it means there's no matching opening bracket
                if (st.isEmpty()) { 
                    return false; 
                } 
                
                char top = st.pop(); 
                
                // Bug Fix 1: Validate that bracket types match up perfectly
                if ((current == ']' && top != '[') || 
                    (current == ')' && top != '(') || 
                    (current == '}' && top != '{')) { 
                    return false; 
                } 
            } 
        } 
        
        // If stack is completely empty, all brackets were successfully balanced
        return st.isEmpty(); 
    } 
}
