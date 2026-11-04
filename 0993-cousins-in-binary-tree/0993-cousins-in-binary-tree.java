class Solution {
    TreeNode xParent = null;
    TreeNode yParent = null ;
    int xDepth = -1;
    int yDepth = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y , 0);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode node, TreeNode parent, int x, int y , int level){
        if(node == null) return;

        if(node.val == x){
            xParent = parent;
            xDepth = level;
        }
        if(node.val == y){
            yParent  = parent;
            yDepth = level;
        }

        dfs(node.left, node, x, y , level +1);
        dfs(node.right, node, x, y , level +1);
    }
}