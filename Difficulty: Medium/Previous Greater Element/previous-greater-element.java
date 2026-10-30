class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            ans.add(-1);
        }
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans.set(st.pop(), arr[i]);
            }
            st.push(i);
        }
        return ans;
    }
}