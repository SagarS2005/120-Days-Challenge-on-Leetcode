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
    // public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    // }
    int postOrderIndex;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postOrderIndex = postorder.length-1;
        for(int i = 0; i< inorder.length; i++){
            map.put(inorder[i],i );
        }
        return build(postorder, 0, inorder.length-1);
    }

    private TreeNode build(int [] postorder, int left, int right){
        if(left > right) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postOrderIndex--]);

        int inorderIndex = map.get(root.val);

        root.right = build(postorder, inorderIndex + 1, right);
        root.left = build(postorder, left , inorderIndex -1);

        
        return root;
    }
}