class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer>  level = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size ; i++ ){
                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(level);
            
        }
        return res;
    }

    
}
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         dfs(root, 0, ans );
//         return ans;
//     }

//     static void dfs(TreeNode root, int level, List<List<Integer>> ans){
//         if(root == null){
//             return ;
//         }

//         if(level == ans.size() ){
//             ans.add(new ArrayList<>());
//         }

//         ans.get(level).add(root.val);
//         dfs(root.left, level + 1, ans);
//         dfs(root.right, level + 1, ans);
//     }
// }