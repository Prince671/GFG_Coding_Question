class Solution {
    static void merge(int[] arr, int s, int e, int mid){
        int leftArrLen=mid-s+1;
        int rightArrLen=e-mid;
        int leftArr[]=new int[leftArrLen];
        int rightArr[]=new int[rightArrLen];
        
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
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<leftArrLen){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrLen){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
        
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return ;
        }
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, r, mid);
    }
}