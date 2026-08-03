import java.util.*;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // LinkedHashSet keeps the sorted order of insertion
        Set<Integer> st = new LinkedHashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        
        
        for (int val : arr) {
            st.add(val);
        }
        for (int val : st) {
            result.add(val);
        }
        return result;
    }
}
