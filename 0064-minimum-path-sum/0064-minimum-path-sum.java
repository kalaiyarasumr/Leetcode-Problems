import java.util.Arrays;

class Solution {
    int dp[][];

    public int minPathSum(int[][] grid) { 
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m + 1][n + 1];  
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return result(m, n, grid);
    }

    private int result(int m, int n, int[][] grid) {
        if (m == 1 && n == 1) {
            return grid[0][0];
        }
        if (m < 1 || n < 1) {
            return Integer.MAX_VALUE;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = grid[m - 1][n - 1] + Math.min(result(m - 1, n, grid), result(m, n - 1, grid));
        return dp[m][n];
    }
}