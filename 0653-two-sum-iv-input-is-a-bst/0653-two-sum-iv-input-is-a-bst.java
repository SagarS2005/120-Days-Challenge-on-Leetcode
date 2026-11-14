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
    Set <Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return check(root, k);
        
    }

    private  boolean check(TreeNode root, int k){
        if(root == null) return false;

        int val = k - root.val;

        if(set.contains(val)) return true;
        set.add(root.val);

       return check(root.left,k ) || check(root.right, k);
    }
}