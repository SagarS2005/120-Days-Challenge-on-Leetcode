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
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i = 0; i< postorder.length; i++){
            map.put(postorder[i] , i);
        }
        return constructTree(preorder,postorder, 0, 0, preorder.length-1);
    }

    private TreeNode constructTree(int [] preorder, int[] postorder, int preorderStart, int postorderStart, int preorderEnd){
        if(preorderStart > preorderEnd) return null;

        TreeNode root = new TreeNode(preorder[preorderStart]);
        if(preorderStart == preorderEnd) return root;
            int nextNode = preorder[preorderStart +1 ];
        // int j = postorderStart;
        
        // while(postorder[j] != nextNode){
        //     j++;
        // }

        int j = map.get(preorder[preorderStart + 1]);
        int size = j - postorderStart + 1;
        // preorderEnd = size - preorderStart + 1;
        
        root.left = constructTree(preorder, postorder, preorderStart + 1, postorderStart, preorderStart + size );

        root.right = constructTree(preorder,postorder,preorderStart + size + 1, j + 1, preorderEnd );

        return root;
    }
}