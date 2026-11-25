class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> ans=new ArrayList<>();
        
        //processing first window of size k 
        for(int i=0; i<k; i++){
            int value=arr[i];
            if(value<0){
                dq.offerLast(i);
            }
        }
        
        // getting the ans of the First Window 
        
        if(dq.size()==0){
            ans.add(0);
        }else{
            ans.add(arr[dq.peekFirst()]);
        }
        
        //  Now Processing the Remaining window
        for(int i=k ; i<arr.length; i++){
            // step 1 -> Removing the unusal value from the DQ
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            
            // step 2-> Now Add the value of the Remaing window
            
            int value=arr[i];
            if(value<0){
                dq.offerLast(i);
            }
        
            // Step 3-> Now Adding The Result to the Ans List 
            
             if(dq.size()==0){
            ans.add(0);
            }else{
                ans.add(arr[dq.peekFirst()]);
            }
        
            
        }
        return ans;
    }
}