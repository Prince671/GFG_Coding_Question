class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=-1;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                i++;
                arr[i]=arr[j];
                j++;
            }
            else{
                j++;
            }
        }
        i++;
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
    }
}