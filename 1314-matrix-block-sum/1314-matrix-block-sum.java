class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        // For Prefix Matrix
        int [][] prefix = new int [rows + 1 ][cols + 1];

        for (int i = 1 ; i <= rows ; i++) {
            for ( int j = 1 ; j <= cols ; j++ ) {
                prefix[i][j] = mat [i - 1][ j - 1] 
                               + prefix [ i - 1][ j ] 
                               + prefix [ i ][j - 1] 
                               - prefix [ i - 1 ][ j - 1];
            }
        }

        // For Ans Matrix 
        int [][] ans = new int [rows][cols];
        
        for ( int i = 0 ; i < rows; i++ ) {
            for ( int j = 0; j < cols ; j++) {
                int r1 = Math.max(0, i - k );    // it ensure that minimum row will be 0
                int c1 = Math.max(0, j - k );

                // it ensure that max rows and colums should not go outside of matrix 
                int r2 = Math.min(i + k, rows - 1);
                int c2 = Math.min (j + k, cols - 1);

                // Since we created Prefix Matrix with "rows + 1" and "cols + 1" from original matrix means if original matrix have 3 rows and 3 cols and prefix matrix will have 4 rows and 4 cols and starting first row and first column will be 0 because we started inserting values from i = 1 and j = 1 

                r1++;
                r2++;
                c1++;
                c2++;

                

                ans[ i ] [ j ] = prefix [ r2 ][ c2 ]
                                 - prefix[ r1 - 1][ c2 ] 
                                 - prefix[ r2 ][ c1 - 1 ] 
                                 + prefix [ r1 - 1] [ c1 - 1];
            }
        }
        return ans;
    }
}