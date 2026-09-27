/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/triangle-path-sum/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    static int minPath(ArrayList<ArrayList<Integer>> triangle, int rowIndex, int colIndex, int[][] dp){
        if(rowIndex==triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }
        
        if(dp[rowIndex][colIndex]!=Integer.MAX_VALUE){
            return dp[rowIndex][colIndex];
        }
        
        int down=minPath(triangle, rowIndex+1, colIndex, dp);
        int diagonal=minPath(triangle, rowIndex+1, colIndex+1, dp);
        
        int minPath=triangle.get(rowIndex).get(colIndex)+Math.min(down, diagonal);
        dp[rowIndex][colIndex]=minPath;
        return dp[rowIndex][colIndex];
    }
    public int minPathSum(ArrayList<ArrayList<Integer>> triangle) {
        // Code here
        int m=triangle.size();
        int[][] dp=new int[m][m];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        
        return minPath(triangle, 0, 0, dp);
    }
}
