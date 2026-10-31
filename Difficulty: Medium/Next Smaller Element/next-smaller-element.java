class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            ans.add(-1);
        }
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                ans.set(i, arr[st.peek()]);
            }
            
            st.push(i);
        }
        return ans;
    }
}