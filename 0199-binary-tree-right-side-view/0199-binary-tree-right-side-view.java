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

    // depth fistr search
    List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        fun(root, 0);
        return list;
    }
    private void fun(TreeNode root, int level){
        if(root == null) return;
        if(list.size() == level){
            list.add(root.val);
        }
        fun(root.right, level + 1);
        fun(root.left , level + 1);
        
    }
}

//  Level  order traversal
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         if(root == null) return new ArrayList<>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         List<Integer> ans = new ArrayList<>();
//         while(!queue.isEmpty()){
//             int size = queue.size();
//             for(int i = 0; i < size; i++){
//                 TreeNode node = queue.poll();
//                 if(i == size-1){
//                     ans.add(node.val);
//                 }
//                 if(node.left != null) queue.offer(node.left);
//                 if(node.right != null) queue.offer(node.right);
//             }            
//         }
//         return ans;
//     }
// }