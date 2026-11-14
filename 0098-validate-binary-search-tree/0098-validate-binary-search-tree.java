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
    public boolean isValidBST(TreeNode root) {
        long leftBoundary = Long.MIN_VALUE;
        long rightBoundary = Long.MAX_VALUE;
        return check(root, leftBoundary, rightBoundary );
    }

    private boolean check(TreeNode root, long leftBoundary, long rightBoundary){
      if(root == null ){
        return true;
      }

      if(leftBoundary >= root.val   || rightBoundary <= root.val) return false;

      return check(root.left, leftBoundary, root.val) && check(root.right, root.val, rightBoundary);
    }
}