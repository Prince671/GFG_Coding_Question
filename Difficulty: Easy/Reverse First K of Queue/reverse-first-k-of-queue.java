class Solution {
   
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        
        if(k>q.size()){
            return q;
        }
        Deque<Integer> st=new ArrayDeque<>();
        int n=q.size();
        
        for(int i=1; i<=k; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        
        for(int i=1; i<=(n-k); i++){
            int element=q.poll();
            q.offer(element);
        }
        
        return q;
    }
}