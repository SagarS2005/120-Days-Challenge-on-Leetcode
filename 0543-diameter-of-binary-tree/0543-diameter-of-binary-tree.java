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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int diameter = 0;

        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            diameter = Math.max(diameter, leftHeight + rightHeight);

            if(node.left != null){
                queue.offer(node.left);
            }
                
            if(node.right !=null) {
                queue.offer(node.right);
            }
            
        }
        return diameter;
    }

    private int height(TreeNode root){
        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i< size; i++){
                TreeNode node = queue.poll();
                            
                if(node.left != null){
                    queue.offer(node.left);
                }
                
                if(node.right !=null){
                    queue.offer(node.right);
                }
            }
            height++;
        }
        return height;
    }
}