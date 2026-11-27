class Solution {
    // public int numIslands(char[][] grid) {
    //     if (grid == null || grid.length == 0) {
    //         return 0;
    //     }
        
    //     int islands = 0;
    //     int rows = grid.length;
    //     int cols = grid[0].length;
    //     boolean[][] visited = new boolean[rows][cols];

    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             if (grid[i][j] == '1' && !visited[i][j]) {
    //                 dfs(i, j, rows, cols, visited, grid);
    //                 islands++;
    //             }
    //         }
    //     }
    //     return islands;
    // }

    // private void dfs(int i, int j, int rows, int cols, boolean[][] visited, char[][] grid) {
    //     if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] || grid[i][j] == '0') {
    //         return;
    //     }

    //     visited[i][j] = true;

    //     dfs(i - 1, j, rows, cols, visited, grid);
    //     dfs(i + 1, j, rows, cols, visited, grid);
    //     dfs(i, j + 1, rows, cols, visited, grid);
    //     dfs(i, j - 1, rows, cols, visited, grid);
    // }

    // Without using visited[][] array (saved O(n^2))
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, rows, cols, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(int i, int j, int rows, int cols, char[][] grid) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        dfs(i - 1, j, rows, cols, grid);
        dfs(i + 1, j, rows, cols, grid);
        dfs(i, j + 1, rows, cols, grid);
        dfs(i, j - 1, rows, cols, grid);
    }
}
