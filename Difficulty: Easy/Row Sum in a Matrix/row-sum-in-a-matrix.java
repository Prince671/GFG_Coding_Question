class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n=mat.length;
        int m=mat[0].length; 
        int rowSum=0;
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            rowSum=0;
            for(int j=0; j<m; j++){
                rowSum+=mat[i][j];
            }
            ans[i]=rowSum;
        }
        return ans;
    }
}