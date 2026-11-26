class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int visited[] = new int[isConnected.length];

        for(int i = 0; i < isConnected.length; i++){
            if(visited[i] != 1){
                dfs(i, visited, isConnected);
                count++;
            }
        }
        return count;
    }

    private void dfs(int node, int [] visited, int[][] isConnected){
        visited[node] =1 ;

        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[node][i] == 1 && visited[i] != 1){
                dfs(i, visited, isConnected);
            }
        }
    }
}