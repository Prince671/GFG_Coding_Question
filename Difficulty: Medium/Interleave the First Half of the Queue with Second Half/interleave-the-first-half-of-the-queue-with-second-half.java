class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
    
        int size=q.size();
              Queue<Integer> q1=new ArrayDeque<>();
              Queue<Integer> q2=new ArrayDeque<>();
              for(int i=1; i<=size/2; i++){
                int x=q.poll();
                q1.offer(x);
              }
              for(int i=1; i<=size/2; i++){
                int x=q.poll();
                q2.offer(x);
              }
        
        
              for(int i=0; i<size; i++){
                if(i%2==0){
                  int x=q1.poll();
                  q.offer(x);
                }else{
                  int x=q2.poll();
                  q.offer(x);
                }
              }
              
            
        
    }
}
