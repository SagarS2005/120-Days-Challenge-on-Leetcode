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
    
    List<TreeNode> node = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root == null) return;

        preorder(root);

        for(int i = 0; i< node.size()-1; i++){
            node.get(i).left = null;
            node.get(i).right = node.get(i+1);
        }
    }

    private void preorder(TreeNode root){
        if(root == null){
            return ;
        }
        node.add(root);

        preorder(root.left);
        preorder(root.right);       
    }
}