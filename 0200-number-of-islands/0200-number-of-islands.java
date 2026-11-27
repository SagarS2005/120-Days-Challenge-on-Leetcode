class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;

        int island = 0;
        boolean visited[][] = new boolean[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    bfs(i,j, grid, visited, row, col);
                    island++;
                }
            }
        }
        return island;
    }

    private void bfs(int i, int j, char [][] grid, boolean [][] visited, int row, int col){
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;

        // Four possible directions
        int[][] directions = {
        {-1, 0},  // Up
        {1, 0},   // Down
        {0, -1},  // Left
        {0, 1}    // Right
    };
        while(!q.isEmpty()){
            int current[] = q.poll();

            int r = current[0];
            int c = current[1];

            for (int[] dir : directions) {

                int newRow = r + dir[0];
                int newCol = c + dir[1];

                // Check boundaries and land
                if (newRow >= 0 && newRow < row &&
                    newCol >= 0 && newCol < col &&
                    visited[newRow][newCol] == false &&
                    grid[newRow][newCol] == '1') {

                    visited[newRow][newCol] = true;

                    q.add(new int[]{newRow, newCol});
                }
            }
            
        }
    }
}