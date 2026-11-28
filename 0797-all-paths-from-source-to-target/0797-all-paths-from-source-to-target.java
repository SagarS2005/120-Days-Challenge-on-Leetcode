class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        findPath(0,graph,path, ans);
        return ans;
    }

    private void findPath(int node,int[][]graph, List<Integer> path, List<List<Integer>> ans){
        if( node == graph.length-1) {
            ans.add(new ArrayList<>(path));
            return;
        }
        
        for(int neighour : graph[node]){
            path.add(neighour);
            findPath(neighour, graph, path, ans);
            path.remove(path.size() -1);
        }
    }
}