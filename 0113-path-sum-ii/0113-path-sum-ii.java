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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
         findList(root, targetSum, ans, list);
         return ans;
    }

    private void findList(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer>list){
        if(root == null) return ;
        targetSum -= root.val;
        list.add(root.val);
        if(root.left == null && root.right == null  && targetSum == 0){
            ans.add(new ArrayList<>(list));
        }

        if(root.left != null) findList(root.left, targetSum, ans, list);
        if(root.right != null) findList(root.right, targetSum, ans, list);
        list.remove(list.size()-1);
    }


    
    // public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    //     List<List<Integer>> output = new ArrayList<>();
    //     dfs(root, targetSum, 0, output, new ArrayList<>());
    //     return output;
    // }

    // private void dfs(TreeNode root, int targetSum, int curSum,
    //                  List<List<Integer>> output, List<Integer> currentPath) {
    //     if (root == null) return;

    //     // Add current node's value to sum and path
    //     curSum += root.val;
    //     currentPath.add(root.val);

    //     // If it's a leaf and path sum equals target, add path to result
    //     if (root.left == null && root.right == null && curSum == targetSum) {
    //         output.add(new ArrayList<>(currentPath));
    //     }

    //     // Recur for children
    //     dfs(root.left, targetSum, curSum, output, currentPath);
    //     dfs(root.right, targetSum, curSum, output, currentPath);

    //     // Backtrack: remove current node
    //     currentPath.remove(currentPath.size() - 1);
    // }
}