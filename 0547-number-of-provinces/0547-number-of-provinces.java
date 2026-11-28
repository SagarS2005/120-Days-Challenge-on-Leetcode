class Solution {
    public int findCircleNum(int[][] isConnected) {
        // int row = isConnected.length -1;
        // int col = isConnected[0].length -1;
        int countProvinces = 0;
        int visited[] = new int[isConnected.length];

        for(int i = 0; i< isConnected.length; i++){
            if(visited[i] != 1){
                bfs(i, visited, isConnected);
                countProvinces++;
            }
        }
        return countProvinces;
    }

    private void bfs(int node , int []visited, int [][] isConnected){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while(!q.isEmpty()){
            int index = q.poll();

            for(int neighour = 0; neighour < isConnected[0].length; neighour++){
                if(isConnected[index][neighour] == 1 && visited[neighour] != 1 ){
                    visited[neighour] = 1;
                    q.add(neighour);
                }
            }
        }
    }

}