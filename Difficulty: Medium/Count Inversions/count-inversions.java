class Solution {
    static int merge(int[] arr, int s, int e, int mid){
        int leftArrLen=mid-s+1;
        int rightArrLen=e-mid;
        int[] leftArr=new int[leftArrLen];
        int[] rightArr=new int[rightArrLen];
        int k=s;
        for(int i=0; i<leftArrLen; i++){
            leftArr[i]=arr[k];
            k++;
        }
        k=mid+1;
        for(int i=0; i<rightArrLen; i++){
            rightArr[i]=arr[k];
            k++;
        }
        
        int i=0; 
        int j=0;
        k=s;
        int inverCount=0;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
                
                inverCount=inverCount+(leftArrLen-i);
                
            }
            k++;
        }
        while(i<leftArrLen){
            arr[k]=leftArr[i];
            k++;
            i++;
        }
        
        while(j<rightArrLen){
            arr[k]=rightArr[j];
            k++;
            j++;
        }
        return inverCount;
    }
    static int mergeSort(int[] arr, int s, int e){
        if(s>=e){
            return 0;
        }
        int mid=(s+e)/2;
        //passing left arr to Recursion 
        int leftInverCount=mergeSort(arr, s, mid);
        // passing right arr to recusion 
        int rightInverCount=mergeSort(arr, mid+1, e);
        
        int mainArrInverCount=merge(arr, s, e, mid);
        
        int ArrInverCount=leftInverCount+rightInverCount+ mainArrInverCount;
        
        return ArrInverCount;
    }
    public int inversionCount(int arr[]) {
        // code here
        int s=0;
        int e=arr.length-1;
        int ans=mergeSort(arr, s, e);
        return ans;
    }
}