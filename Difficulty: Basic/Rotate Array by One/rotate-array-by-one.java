class Solution {
    public void rotate(int[] arr) {
        // code here
        int temp[]=new int[1];
        temp[0]=arr[arr.length-1];
        
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp[0];
        
    }
}