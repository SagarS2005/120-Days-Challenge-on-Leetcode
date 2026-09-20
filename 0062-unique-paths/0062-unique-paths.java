class Solution {
    // public int uniquePaths(int m, int n) {
    //     return countPath(m-1, n-1);       
    // }

    // private int countPath(int row, int col){
    //     if (row == 0 || col == 0){
    //         return 1;
    //     }
    //     return countPath(row-1, col) + countPath(row, col-1);
    // }
    // public int uniquePaths(int m, int n) {
    //     int[] aboveRow = new int[n];
    //     Arrays.fill(aboveRow, 1);

    //     for (int row = 1; row < m; row++) {
    //         int[] currentRow = new int[n];
    //         Arrays.fill(currentRow, 1);
    //         for (int col = 1; col < n; col++) {
    //             currentRow[col] = currentRow[col - 1] + aboveRow[col];
    //         }
    //         aboveRow = currentRow;
    //     }

    //     return aboveRow[n - 1];        
    // }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return countPath(m-1 , n-1 , dp);
    }
    private int countPath(int row, int col, int [][] dp){
        if (row == 0 || col == 0){
            return 1;
        }

        if(dp[row][col] != 0){
            return dp[row][col];
        }
        dp[row][col] = countPath(row-1, col,dp) + countPath(row, col-1,dp);
        return dp[row][col];
    }
}