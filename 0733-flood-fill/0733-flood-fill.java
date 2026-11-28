class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int row = image.length -1 ;
        int col = image[0].length -1 ;
        int filledNumber = image[sr][sc];
        if(filledNumber == color) return image;
        dfs(sr, sc, color, image, row, col, filledNumber);
        return image;
    }

    private void dfs(int sr, int sc, int color, int[][] image, int row, int col, int filledNumber){
        if(sr < 0 || sr > row || sc < 0 || sc > col || image[sr][sc] != filledNumber || image[sr][sc] == color){
            return;
        }
        image[sr][sc] = color;

        // Call for all direction
        dfs(sr - 1, sc, color, image, row, col, filledNumber);
        dfs(sr + 1, sc, color, image, row, col, filledNumber);
        dfs(sr , sc - 1, color, image, row, col, filledNumber);
        dfs(sr , sc + 1, color, image, row, col, filledNumber);
    }
}