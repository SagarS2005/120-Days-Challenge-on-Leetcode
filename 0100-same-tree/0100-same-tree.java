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
class Solution {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder1(p);
        inorder2(q);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    void inorder1(TreeNode root){
        if(root == null){
            list1.add(null);
            return;
        }
        list1.add(root.val);
        inorder1(root.left);
        inorder1(root.right);
    }
    void inorder2(TreeNode root){
        if(root == null){
            list2.add(null);
            return;
        }
        list2.add(root.val);
        inorder2(root.left);
        inorder2(root.right);
    }
}

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
        
//         // Base case: if both trees are null, they are identical
//         if (p == null && q == null) {
//             return true;
//         }
//         // If only one tree is null or the values are different, they are not identical
//         if (p == null || q == null || p.val != q.val) {
//             return false;
//         }

//         // Recursively check if the left and right subtrees are identical
//         // return isSameTree(p.left, q.left) &&isSameTree(p.right, q.right) ;

//         boolean left = isSameTree(p.left, q.left);
//         boolean right = isSameTree(p.right, q.right);
//         return left && right;
//     }
// }