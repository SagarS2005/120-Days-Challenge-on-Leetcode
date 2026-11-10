/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        Map<Integer, Integer> map = new HashMap<>();
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        getLevel(root, 0);

        TreeNode LCA = bfs(root);

        return LCA;
    }
    
    int maxDepth = 0;
    private void getLevel(TreeNode root, int depth){
        if(root == null) return;
        map.put(root.val, depth);
        maxDepth = Math.max(maxDepth, depth);

        getLevel(root.left, depth+1);
        getLevel(root.right, depth+1);
        
    }

    private TreeNode bfs (TreeNode root){
        if(root == null) return null;

        if(map.get(root.val) == maxDepth){
            return root;
        }

        TreeNode left = bfs(root.left);
        TreeNode right = bfs(root.right);

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}