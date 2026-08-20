class Solution {
    public void quickSort(int[] arr, int low, int high) {

        if(low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        // left array for sorting
        quickSort(arr, low, pivotIndex - 1);

        // right array for sorting
        quickSort(arr, pivotIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int count = 0;

        // Counting elements smaller than or equal to pivot
        for(int i = low+1; i <= high; i++) {
            if(arr[i] <= pivot) {
                count++;
            }
        }

        int correctPostionOfPivot = low + count;

        int temp = arr[correctPostionOfPivot];
        arr[correctPostionOfPivot] = arr[low];
        arr[low] = temp;

        // Verifying elements on left are smaller
        // and elements on right are greater
        int i = low;
        int j = high;

        while(i < correctPostionOfPivot && j > correctPostionOfPivot) {
            
            while(arr[i]<=arr[correctPostionOfPivot]){
                i++;
            }
            while(arr[j]>arr[correctPostionOfPivot]){
                j--;
            }
            if(i < correctPostionOfPivot && j > correctPostionOfPivot){

                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;

                    i++;
                    j--;
                
            }
            
        }

        return correctPostionOfPivot;
    }
}