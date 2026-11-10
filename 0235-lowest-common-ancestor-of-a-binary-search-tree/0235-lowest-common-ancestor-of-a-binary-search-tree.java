/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q) return root;
        if(root.val > p.val && root.val < q.val) return root;
        if(root.val < p.val && root.val > q.val) return root;

        TreeNode left = dfs(root.left, p , q);
        TreeNode right = dfs(root.right, p , q);
        
        return left != null ? left : right;
    }
}