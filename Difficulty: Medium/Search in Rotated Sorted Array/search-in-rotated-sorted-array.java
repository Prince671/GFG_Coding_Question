class Solution {
    static int getPivotIndex(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=arr[n-1]){
                right=mid-1;
            }else{
                ans=mid;
                left=mid+1;
            }
        }
        return ans;
    }

    static int binarySearch(int arr[], int start, int end, int target){
        int s=start;
        int e=end;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<=target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivotIndex=getPivotIndex(nums);
        int n=nums.length;
        int ans=0;
        
        if(pivotIndex==-1){
            ans=binarySearch(nums, 0, n-1, target);
            return ans;
        }
        else{
            int startIndexOfArray1=0;
            int endIndexOfArray1=pivotIndex;
            if(target>=nums[startIndexOfArray1] && target<=nums[endIndexOfArray1]){
                ans=binarySearch(nums, startIndexOfArray1, endIndexOfArray1, target);
                return ans;
            }
            
            int startIndexOfArray2=pivotIndex+1;
            int endIndexOfArray2=n-1;

            if(target>=nums[startIndexOfArray2] && target<=nums[endIndexOfArray2]){
                ans=binarySearch(nums, startIndexOfArray2 , endIndexOfArray2, target);
                return ans;
            }
        }
        return -1;
    }
}