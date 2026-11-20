class Solution {
    public static void recursionHelper(Queue<Integer> q){
        if(q.isEmpty()){
            return ;
        }
        int frontElement=q.poll();

        recursionHelper(q);

        q.offer(frontElement);
    }
    public void reverseQueue(Queue<Integer> q) {
        // code here
        // Deque<Integer> st=new ArrayDeque<>();
        // while(!q.isEmpty()){
        //     st.push(q.poll());
        // }

        // while(!st.isEmpty()){
        //     q.offer(st.pop());
        // }


        //Recursive Solution 

        recursionHelper(q);

    }
}