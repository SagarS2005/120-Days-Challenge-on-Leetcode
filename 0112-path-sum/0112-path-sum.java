class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        // Recurse down both paths, subtracting the current value from the target
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
