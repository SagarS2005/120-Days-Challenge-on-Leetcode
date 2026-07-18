class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res [] = new int [2];
        Set <Integer> set = new HashSet<>();
        
        int sum = 0;
        for(int i = 0; i < grid.length ; i++){
            int k = 0;
            for(int j = 0; j < grid.length ; j++){
                sum += grid[i][j];
                if(set.contains(grid[i][j])){
                    res[0] = grid[i][j];            //  res[0] = a;
                }
                set.add(grid[i][j]);          
            } 
        }
        
        int totalElement = grid.length * grid.length;
        int expectedSum = (totalElement * (totalElement +1))/2;
        int b = expectedSum + res[0] - sum;     // a = res[0]
        res[1] = b;
        
        return res;
     
    }
}