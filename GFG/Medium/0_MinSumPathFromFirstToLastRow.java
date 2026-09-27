/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/minimum-sum-in-a-falling-path/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

import java.util.*;

class Solution {
    static int getPath(int[][] mat, int rowIndex, int colIndex,
                       int n, int[][] dp) {

        if (rowIndex >= n || colIndex >= n || colIndex < 0) {
            return Integer.MAX_VALUE;
        }

        if (rowIndex == n - 1) {
            return mat[rowIndex][colIndex];
        }

        if (dp[rowIndex][colIndex] != Integer.MAX_VALUE) {
            return dp[rowIndex][colIndex];
        }

        // Moving downward
        int down = getPath(mat, rowIndex + 1, colIndex, n, dp);

        // Moving right diagonal
        int rightDiagonal = getPath(mat, rowIndex + 1, colIndex + 1, n, dp);

        // Moving left diagonal
        int leftDiagonal = getPath(mat, rowIndex + 1, colIndex - 1, n, dp);

        int minPath = Math.min(down, Math.min(rightDiagonal, leftDiagonal));

        // Avoid integer overflow
        if (minPath == Integer.MAX_VALUE) {
            return dp[rowIndex][colIndex] = Integer.MAX_VALUE;
        }

        int finalAns = mat[rowIndex][colIndex] + minPath;
        dp[rowIndex][colIndex] = finalAns;

        return dp[rowIndex][colIndex];
    }

    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        int minSum = Integer.MAX_VALUE;

        for (int col = 0; col < n; col++) {
            minSum = Math.min(minSum, getPath(mat, 0, col, n, dp));
        }

        return minSum;
    }
}
