class Solution {
    static int getMaxPath(int[][] mat, int rowIndex, int colIndex,
                          int m, int n, int[][] dp) {
        if (rowIndex >= m || colIndex >= n || colIndex < 0) {
            return Integer.MIN_VALUE;
        }

        // Base case: reached the last row
        if (rowIndex == m - 1) {
            return mat[rowIndex][colIndex];
        }
        
        if(dp[rowIndex][colIndex]!=Integer.MAX_VALUE){
            return dp[rowIndex][colIndex];
        }

        int down = getMaxPath(mat, rowIndex + 1, colIndex, m, n, dp);
        int rightDiagonal = getMaxPath(mat, rowIndex + 1, colIndex + 1, m, n, dp);
        int leftDiagonal = getMaxPath(mat, rowIndex + 1, colIndex - 1, m, n, dp);

        int maxPath = mat[rowIndex][colIndex]
                + Math.max(down, Math.max(rightDiagonal, leftDiagonal));

        dp[rowIndex][colIndex]=maxPath;
        return dp[rowIndex][colIndex];
    }

    public int maximumPath(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
       int[][] dp = new int[m][n];

       for (int i = 0; i < m; i++) {
           Arrays.fill(dp[i], Integer.MAX_VALUE);
       }

        int maxPath = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxPath = Math.max(maxPath,
                    getMaxPath(mat, 0, i, m, n, dp));
        }

        return maxPath;
    }
}