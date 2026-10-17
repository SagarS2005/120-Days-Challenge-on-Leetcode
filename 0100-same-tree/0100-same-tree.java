// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     List<Integer> list1 = new ArrayList<>();
//     List<Integer> list2 = new ArrayList<>();
//     boolean res = false;
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         list1 = postOrder(p);
//         list2 = postOrder(q);
//         res = list1.equals(list2);
//         return res;
//     }

    

//     public List<Integer> postOrder(TreeNode root){
//         List<Integer>  res = new ArrayList<>();
//         // if(root == null){
//         //     return ;
//         // }
//         postOrder(root.left);
//         postOrder(root.right);
//         res.add(root.val);
//         return res;
//     }
// }

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: if both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If only one tree is null or the values are different, they are not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}